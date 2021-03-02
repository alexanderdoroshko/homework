package hw_05032021;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7_TornArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        int min=1;
        int max=7;
        int a = rnd.nextInt(max-min+1)+min;
        int b = rnd.nextInt(max-min+1)+min;
        int c = rnd.nextInt(max-min+1)+min;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int [][] array = new int [3] [];
        array [0]=new int[a];
        array [1]=new int[b];
        array [2]=new int[c];
        System.out.println(Arrays.deepToString(array));


        for (int i=0;i<array.length;i++){
            for (int j=0; j<array[i].length;j++){
                array[i][j]= rnd.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
