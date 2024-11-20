package edu.internship.behavioral.state;

public class ReadyState extends State {

    public ReadyState(edu.internship.behavioral.state.Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        return phone.home();
    }

    @Override
    public String onOffOn() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }

}
