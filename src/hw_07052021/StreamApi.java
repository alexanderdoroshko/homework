package hw_07052021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, "ведьма", "костер", "шабаш", "вудалак", "демон", "око", "топот");
        System.out.println(words.toString());
        List<String> filteredWords = words.stream().filter(s -> s.equals(new StringBuilder(s).reverse().toString())).collect(Collectors.toList());
        System.out.println(filteredWords.toString());

    }
}
