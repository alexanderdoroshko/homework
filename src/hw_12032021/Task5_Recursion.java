package hw_12032021;

import java.util.Scanner;

public class Task5_Recursion {
    public static boolean recursion(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2

        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a natural number n>1");
        int n = sc.nextInt();

        if (recursion(n, 2) == true) {
            System.out.printf("Is number %d simple - YES \n", n);
        } else {
            System.out.printf("Is number %d simple - NO \n", n);
        }

    }
}

