package edu.internship.structural.adapter;

public class JSONToXMLOrderAdapter implements XMLOrderProcessor {
    private SimpleJSONOrderProcessor jsonOrderProcessor;

    public JSONToXMLOrderAdapter(SimpleJSONOrderProcessor jsonOrderProcessor) {
        this.jsonOrderProcessor = jsonOrderProcessor;
    }

    @Override
    public void processOrder(String xmlOrder) {
        String jsonOrder = convertXMLToJSON(xmlOrder);
        jsonOrderProcessor.handleOrder(jsonOrder);
    }

    private String convertXMLToJSON(String xmlOrder) {
        return "{ \"order\": \"" + xmlOrder.replace("<order>", "").replace("</order>", "") + "\" }";
    }
}
