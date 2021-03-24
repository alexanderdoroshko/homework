package hw_19032021;

import java.util.Random;

public class Computer {
    private String cpu;
    private int ram;
    private int hdd;

    public Computer(String cpu, int ram, int hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void info() {
        System.out.printf("CPU: %s, RAM: %d GB, HDD: %d GB\n", cpu, ram, hdd);
    }

    public void onComputer(int x) {
        Random rnd = new Random();
        int a = rnd.nextInt(2);
        if (x == a) {
            System.out.println("Computer ON");
        } else {
            System.out.println("Fatal error.Computer burned out");
        }
    }

    public void offComputer(int x) {
        Random rnd = new Random();
        int a = rnd.nextInt(2);
        if (x == a) {
            System.out.println("Computer Off");
        } else {
            System.out.println("Fatal error.Computer burned out");
        }
    }
}

