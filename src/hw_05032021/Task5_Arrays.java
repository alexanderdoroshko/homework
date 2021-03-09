package hw_05032021;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количетво элементов массива");
        int n = scanner.nextInt();
        int[] array = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt();
        }
        System.out.println(Arrays.toString(array));

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
