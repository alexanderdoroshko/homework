package hw_12032021;

public class Task2_Ameba {
    public static void main(String[] args) {
        int hour = 3;
        int ameba = 1;
        int step = 2;
        for (hour = 3; hour <= 24; hour += 3) {
            ameba = ameba * step;
            System.out.printf("Количество амеб равно %d через %d часа\n", ameba, hour);
        }
    }
}
