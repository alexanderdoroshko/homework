package hw_05032021;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6_ArraysTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую размерность массива");
        int n = sc.nextInt();
        System.out.println("Введите вторую размерность массива");
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }

            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
