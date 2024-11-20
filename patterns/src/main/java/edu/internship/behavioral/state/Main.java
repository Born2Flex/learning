package edu.internship.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();

        System.out.println("Initial state: Off");
        System.out.println(phone.clickPower());

        System.out.println("State: Locked");
        System.out.println(phone.clickHome());
        System.out.println(phone.clickPower());

        System.out.println("State: Off");
        System.out.println(phone.clickPower());

        System.out.println("State: Locked");
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.unlock());

        System.out.println("State: Ready");
        System.out.println(phone.clickHome());

        System.out.println("State: Home");
        System.out.println(phone.clickHome());
        System.out.println(phone.clickPower());

        System.out.println("State: Locked");
    }
}
