package edu.internship.creational.builder;

public class PC {
    private final String cpu;
    private final String ram;
    private final String psu;
    private final String gpu;
    private final String ssd;
    private final String caseType;

    PC(String cpu, String ram, String psu, String gpu, String ssd, String caseType) {
        this.cpu = cpu;
        this.ram = ram;
        this.psu = psu;
        this.gpu = gpu;
        this.ssd = ssd;
        this.caseType = caseType;
    }

    @Override
    public String toString() {
        return "PC [" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", psu='" + psu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ssd='" + ssd + '\'' +
                ", case='" + caseType + '\'' +
                ']';
    }
}
