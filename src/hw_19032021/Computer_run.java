package hw_19032021;

import java.util.Scanner;

public class Computer_run {
    public static void main(String[] args) {
        Computer comp = new Computer("Intel Core i5-4570", 8, 1000);
        comp.info();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число равное 0 или 1");
        int on = sc.nextInt();
        comp.onComputer(on);
        int off = sc.nextInt();
        comp.offComputer(off);
    }
}

