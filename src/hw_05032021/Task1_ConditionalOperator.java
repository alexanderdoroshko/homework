package hw_05032021;

import java.util.Scanner;

public class Task1_ConditionalOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый размер прямоугольного отверстия");
        double a= in.nextDouble();
        System.out.println("Введите второй размер прямоугольного отверстия");
        double b= in.nextDouble();
        System.out.println("Введите радиус круглой картонки");
        double r= in.nextDouble();
        if (4*r*r>=a*a+b*b){               //Диаметр необходимой окружности равен или больше диагонали прямоугольника
            System.out.println("Круг закроет отверстие");
        }else {
            System.out.println("Круг не закроет отверстие");
        }
    }
}
