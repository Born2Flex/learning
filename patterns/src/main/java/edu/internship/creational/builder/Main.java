package edu.internship.creational.builder;

public class Main {
    public static void main(String[] args) {
        PC basicPC = new PC("Intel i3", "8GB", "256GB SSD", null, null, null);
        System.out.println(basicPC);

        PC gamingPC = new PC("Intel i9", "32GB", "1TB SSD", "NVIDIA RTX 3080", null, "Mid Tower");
        System.out.println(gamingPC);

        PCBuilder builder = new PCBuilderImpl();
        PC gamingPCByBuilder= builder.cpu("Intel i9")
                .ram("32GB")
                .ssd("1TB")
                .gpu("NVIDIA RTX 3080")
                .caseType("Mid Tower")
                .build();
        System.out.println(gamingPCByBuilder);

        Director director = new Director();
        director.buildOfficePC(builder);
        PC officePC = builder.build();
        System.out.println(officePC);
    }
}
