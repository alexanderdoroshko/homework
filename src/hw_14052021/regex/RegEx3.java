package hw_14052021.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {
    public static void main(String[] args) {
        String str1 = "http://example.com/";
        String str2 = "example.com";

        Pattern pattern = Pattern.compile("^(http://)");
        Matcher matcher = pattern.matcher(str1);
        System.out.println(matcher.find());


    }
}

