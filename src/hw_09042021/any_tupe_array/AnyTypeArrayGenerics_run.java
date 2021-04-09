package hw_09042021.any_tupe_array;

import hw_09042021.any_tupe_array.AnyTypeArray;

public class AnyTypeArrayGenerics_run {
    public static void main(String[] args) {
        AnyTypeArray arr1 =new AnyTypeArray(544,566,345);
        AnyTypeArray arr2= new AnyTypeArray("Java","programming","is cool");
        AnyTypeArray arr3 = new AnyTypeArray(41.3,-78.2,12.3);

        System.out.println(arr1.getElementArray(2));
        System.out.println(arr2.getElementArray(1));
        System.out.println(arr3.getElementArray(0));
    }
}





