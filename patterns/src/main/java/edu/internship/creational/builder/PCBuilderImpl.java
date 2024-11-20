package edu.internship.creational.builder;

public class PCBuilderImpl implements PCBuilder {
    private String cpu;
    private String ram;
    private String psu;
    private String gpu;
    private String ssd;
    private String caseType;

    public PCBuilderImpl cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public PCBuilderImpl ram(String ram) {
        this.ram = ram;
        return this;
    }

    public PCBuilderImpl psu(String psu) {
        this.psu = psu;
        return this;
    }

    public PCBuilderImpl gpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public PCBuilderImpl ssd(String ssd) {
        this.ssd = ssd;
        return this;
    }

    public PCBuilderImpl caseType(String caseType) {
        this.caseType = caseType;
        return this;
    }

    public PC build() {
        return new PC(cpu, ram, psu, gpu, ssd, caseType);
    }
}
