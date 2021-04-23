package hw_23042021;

public class TextFormater {
    int numberWord(String s) {
        String[] words = s.split(" ");
        int count = 0;
        for (String w : words) {
            count++;
        }
        return count;
    }

    boolean isPalindrome(String s) {
        String[] words = s.split(" ");
        boolean isPalindrome = false;
        for (String substr : words) {
            if (substr.equals(new StringBuilder(substr).reverse().toString())) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
