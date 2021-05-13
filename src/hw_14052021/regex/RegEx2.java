package hw_14052021.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println(data);
        // Здесь ограничение на формат даты, т.е. нельзя ввести 45 день или 14 месяц
        Pattern pattern = Pattern.compile("[12][09][0-9][0-9]/(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])\\s[0-2][0-9]:[0-5][0-9]:[0-5][0-9]");
        Matcher matcher = pattern.matcher(data);
        boolean found = matcher.matches();
        if (found)
            System.out.println("Дата соответствует формату  YYYY/MM/DD HH:MM:SS");
        else
            System.out.println("Дата не соответствует  формату  YYYY/MM/DD HH:MM:SS");
    }
}

