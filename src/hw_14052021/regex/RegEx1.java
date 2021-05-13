package hw_14052021.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
        String ipAddress1 = "127.0.0.1";
        String ipAddress2 = "255.255.255.0";
        String ipAddress3 = "1300.6.7.8";
        String ipAddress4 = "abc.def.gha.bcd";

        Pattern pattern = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$");
        Matcher matcher = pattern.matcher(ipAddress2);
        boolean found = matcher.matches();
        if (found)
            System.out.println("IP адрес");
        else
            System.out.println("Не IP адрес");
    }


}

