package Lab08;

public class ComputerTest {
    public static void main(String[] args) {
        CPU cpu = new CPU("INTEL CORE i7");
        System.out.println(cpu);
        Ram ram = new Ram(2048);
        System.out.println(ram);
        Computer computer = new Computer("DELL Desktop", cpu, ram);
        System.out.println(computer);
    }
}
