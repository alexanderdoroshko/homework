package hw_12032021;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4_ArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n>3");
        int n = sc.nextInt();
        while (n < 4) {
            System.out.println("Ошибка! Введите число n>3");
            n = sc.nextInt();
        }
        System.out.println("Вы ввели число " + n);
        int[] array1 = new int[n];
        Random rnd = new Random();
        int m = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rnd.nextInt(n + 1);
            if (array1[i] % 2 == 0 & array1[i] != 0) {
                m++;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("Количество четных элементов " + m);
        if (m > 0) {
            int[] array2 = new int[m];
            m = 0;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] % 2 == 0 & array1[i] != 0) {
                    array2[m] = array1[i];
                    System.out.print(array2[m] + " ");
                    m++;
                }
            }

        }

    }
}


