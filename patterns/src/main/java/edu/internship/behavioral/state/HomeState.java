package edu.internship.behavioral.state;

public class HomeState extends State {

    public HomeState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        return "Already on the home screen.";
    }

    @Override
    public String onOffOn() {
        phone.setState(new LockedState(phone));
        return phone.lock();
    }
}
