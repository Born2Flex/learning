package edu.internship.creational.builder;

public interface PCBuilder {
    PCBuilderImpl cpu(String cpu);

    PCBuilderImpl ram(String ram);

    PCBuilderImpl psu(String psu);

    PCBuilderImpl gpu(String gpu);

    PCBuilderImpl ssd(String ssd);

    PCBuilderImpl caseType(String caseType);

    PC build();
}
