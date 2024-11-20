package edu.internship.behavioral.state;

public class Phone {
    private State state;

    public Phone() {
        state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String lock() {
        setState(new OffState(this));
        return "Locking phone and turning off the screen";
    }

    public String home() {
        setState(new HomeState(this));
        return "Going to home-screen";
    }

    public String unlock() {
        setState(new ReadyState(this));
        return "Unlocking the phone";
    }

    public String turnOn() {
        setState(new LockedState(this));
        return "Turning screen on, device still locked";
    }

    public String clickHome() {
        return state.onHome();
    }

    public String clickPower() {
        return state.onOffOn();
    }
}
