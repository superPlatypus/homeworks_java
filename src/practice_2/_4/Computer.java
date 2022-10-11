package practice_2._4;

public class Computer {
    private String cpu;
    private int dram;
    private int price;

    public Computer() {
    }

    public Computer(String cpu, String gpu, int dram, int price) {
        this.cpu = cpu;
        this.dram = dram;
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }


    public int getDram() {
        return dram;
    }

    public void setDram(int dram) {
        this.dram = dram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", dram=" + dram +
                ", price=" + price +
                '}';
    }
}
