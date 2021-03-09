package hw_05032021;


import java.util.Arrays;
import java.util.Random;

public class Task7_TornArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        int min = 1;
        int max = 7;

        int[][] array = new int[4][];
        for (int i = 0; i < 4; i++) {
            array[i] = new int[rnd.nextInt(max - min) + min];
        }
        System.out.println(Arrays.deepToString(array));


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
