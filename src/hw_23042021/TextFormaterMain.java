package hw_23042021;

import java.io.*;
import java.util.ArrayList;

public class TextFormaterMain {
    public static void main(String[] args) {
        ArrayList<String> someText = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("D://tmp//someText.txt"))) { //Считываем построчно
            String s;
            while ((s = br.readLine()) != null) {
                someText.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        StringBuilder sb = new StringBuilder();

        for (String a : someText) {
            sb.append(a);
        }

        System.out.println(sb);
        String qwt = sb.toString();
        String[] sentence = qwt.split("\\.");  // Разбиваем на предложения через символ "."

        TextFormater textFormater = new TextFormater();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("D://tmp//someTextCorrect.txt"))) {
            for (String s : sentence) {
                if (textFormater.numberWord(s) > 3 && textFormater.numberWord(s) < 5 || textFormater.isPalindrome(s)) {
                    s = s + ".";
                    bw.write(s);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
