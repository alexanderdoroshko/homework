package hw_23042021;

import java.io.*;
import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(PathFile.PALINDROMEINPUT.path))) {
            String s;
            while ((s = br.readLine()) != null) {
                word.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(word.toString());
        ArrayList<String> palindrome = new ArrayList<>();

        for (String s : word) {
            if (s.equals(new StringBuilder(s).reverse().toString())) {
                palindrome.add(s);
            }
        }
        System.out.println(palindrome.toString());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PathFile.PALINDROMEOUTPUT.path))) {
            bw.write(palindrome.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
