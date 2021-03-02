package hw_05032021;

public class Task4_Arrays {
    public static void main(String[] args) {
        double array[] = {34, 56, 435, -5235, 5, 6.6, -5, 52345, -4.57, 43, -8};
        double sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum1 += array[i];
            }
        }
        System.out.println("Сумма отрицательных элементов:" + sum1);


        double min = array[0];                               // поиск минимума
        int numbermin=0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                numbermin=i;
            }
        }
        System.out.println("Минимальный элемент " + min);
        System.out.println("Номер минимального элемента " + numbermin);
        double max = array[0];                               //поиск максимума
        int numbermax=0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                numbermax=i;
            }
        }
        System.out.println("Максимальный элемент " + max);
        System.out.println("Номер максимального элемента " + numbermax);
        int qw=numbermin;                    //замена местами, если min элемент встречается раньше max
        if (numbermin>numbermax){
            numbermin=numbermax;
            numbermax=qw;
        }
        double result=1; //умножение
        for (int i=(numbermin+1);i<numbermax;i++){
            result*=array[i];
        }
        System.out.println(result);
    }
}
