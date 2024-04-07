package Lab08;

public class Computer {
    private String model;
    private CPU cpu;
    private Ram ram;

    public Computer(String model, CPU cpu, Ram ram) {
        this.model = model;
        this.ram = ram;
        this.cpu = cpu;
    }

    public String getModel() {
        return model;
    }

    public CPU getCPU() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public String toString() {
        return String.format("=== Computer ===%nModel : %s%n%s%n%s%n", getModel(), getCPU().toString(),
                getRam().toString());
    }
}
