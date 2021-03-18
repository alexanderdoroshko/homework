package hw_19032021;

import java.util.Random;

public class Computer {
    private String CPU;
    private int RAM;
    private int HDD;

    public Computer(String CPU, int RAM, int HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public void info() {
        System.out.printf("CPU: %s, RAM: %d GB, HDD: %d GB\n", CPU, RAM, HDD);
    }

    public void OnComputer(int x) {
        Random rnd = new Random();
        int a = rnd.nextInt(2);
        if (x == a) {
            System.out.println("Computer ON");
        } else {
            System.out.println("Fatal error.Computer burned out");
        }
    }

    public void OffComputer(int x) {
        Random rnd = new Random();
        int a = rnd.nextInt(2);
        if (x == a) {
            System.out.println("Computer Off");
        } else {
            System.out.println("Fatal error.Computer burned out");
        }
    }
}

