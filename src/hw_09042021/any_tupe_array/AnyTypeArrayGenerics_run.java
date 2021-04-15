package hw_09042021.any_tupe_array;

public class AnyTypeArrayGenerics_run {
    public static void main(String[] args) {
        AnyTypeArray<Integer> intObj = new AnyTypeArray<>(new Integer[]{566, 345, 765, 23425});
        AnyTypeArray<String> strObj = new AnyTypeArray<>(new String[]{"Program", "java", "is cool"});
        AnyTypeArray<Double> doubleObj = new AnyTypeArray<>(new Double[]{-545474.55,4774.78,56.56});

        System.out.println(intObj.getElementIndex(0));
        System.out.println(strObj.getElementIndex(1));
        System.out.println(doubleObj.getElementIndex(2));


    }
}





