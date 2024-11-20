package edu.internship.structural.adapter;

public class SimpleJSONOrderProcessor implements JSONOrderProcessor {
    @Override
    public void handleOrder(String jsonOrder) {
        System.out.println("Handling JSON Order: " + jsonOrder);
    }
}
