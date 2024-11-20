package edu.internship.structural.adapter;

public class Main {
    public static void main(String[] args) {
        XMLOrderProcessor xmlOrderProcessor = new SimpleXMLOrderProcessor();
        SimpleJSONOrderProcessor jsonOrderProcessor = new SimpleJSONOrderProcessor();
        XMLOrderProcessor adapter = new JSONToXMLOrderAdapter(jsonOrderProcessor);

        String xmlOrder = "<order>Order123</order>";
        String jsonOrder = "{ \"order\": \"Order123\" }";

        xmlOrderProcessor.processOrder(xmlOrder);

        adapter.processOrder(xmlOrder);
    }
}
