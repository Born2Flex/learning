package edu.internship.creational.builder;

public class Director {
    public void buildOfficePC(PCBuilder builder) {
        builder.gpu("Integrated")
                .ram("8 GB")
                .cpu("i3 8100")
                .psu("500W")
                .psu("500GB");
    }

    public void buildGamingPC(PCBuilder builder) {
        builder.gpu("NVIDIA RTX 3080")
                .ram("32 GB")
                .cpu("i7 12600k")
                .psu("750W")
                .ssd("2TB");
    }
}
