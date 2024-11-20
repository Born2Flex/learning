package edu.internship.structural.adapter;

public class SimpleXMLOrderProcessor implements XMLOrderProcessor{
    @Override
    public void processOrder(String xmlOrder) {
        System.out.println("Processing XML Order: " + xmlOrder);
    }
}
