package hw_23042021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Censor {
    public static void main(String[] args) {
        ArrayList<String> censoredText = new ArrayList<>();
        ArrayList<String> blackList = new ArrayList<>();

        try (BufferedReader bfr = new BufferedReader(new FileReader("D://tmp//censor.txt"))) {
            String s;
            while ((s = bfr.readLine()) != null) {
                censoredText.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(censoredText.toString());


        try (BufferedReader bfr = new BufferedReader(new FileReader("D://tmp//blacklist.txt"))) {
            String s;
            while ((s = bfr.readLine()) != null) {
                blackList.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(blackList.toString());


        int countCensorSentence = 0;
        boolean isCensor = false;
        ArrayList<String> censorSentence = new ArrayList<>();

        for (String s : censoredText) {
            for (String bs : blackList) {
                if (s.contains(bs)) {
                    isCensor = true;
                    censorSentence.add(s);
                    countCensorSentence++;
                } else {
                    isCensor = false;
                }
            }
        }
        if (isCensor) {
            System.out.println("Текст не прошел проверку на цензуру");
            System.out.printf("Количество не прошедших предложений: %d\n", countCensorSentence);
            System.out.println(censorSentence);
        } else {
            System.out.println("Текст прошел проверку на цензуру");
        }
    }
}
