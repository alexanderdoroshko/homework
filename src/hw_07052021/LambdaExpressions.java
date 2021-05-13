package hw_07052021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpressions {
    public static void main(String[] args) {

        String[] array1 = {"Я учусь", "программировать", "на Java", "это", "довольно весело"};
        String[] array2 = {"Массив", "строк", "некоторой длины"};
        String[] array3 = {"Еще один", "массив с ", "другой длиной", "строк"};

        ArrayList<String[]> arrayCollection = new ArrayList<>();
        Collections.addAll(arrayCollection, array1, array2, array3);

        for (String[] str : arrayCollection) {
            System.out.println(Arrays.toString(str));
        }
        System.out.println();


        arrayCollection.sort(Comparator.comparingInt(o -> o.length));
        for (String[] str : arrayCollection) {
            System.out.println(Arrays.toString(str));
        }
        System.out.println();

        arrayCollection.sort((o1, o2) -> -(o1.length - o2.length));
        for (String[] str : arrayCollection) {
            System.out.println(Arrays.toString(str));
        }
    }
}
