package hw_09042021.car;

public class Car_run {
    public static void main(String[] args) {
        Car skoda = new Car("Skoda", 145.7, 17_000);
        Car bmw = new Car("BMW", 185.8, 30_000);
        Car mercedes = new Car("Mercedes", 170.5, 50_000);

        try {
            skoda.start();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }

        try {
            bmw.start();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }

        try {
            mercedes.start();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
    }
}
