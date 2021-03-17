package hw_12032021;

public class Task1_Sportsmen {
    public static void main(String[] args) {
        double distance = 10;
        double step = 0.1;
        int day = 1;
        for (day = 2; day <= 7; day++) {
            distance += distance * step;
        }
        System.out.println(distance);
    }
}
