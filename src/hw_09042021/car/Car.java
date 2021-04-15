package hw_09042021.car;

public class Car {
    private String brand;
    private double speed;
    private double price;

    public Car(String brand, double speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() throws StartCarException {
        int randomNumber = (int) (Math.random() * 21);
        if (randomNumber % 2 == 0) {
            throw new StartCarException("Попробуй ещё раз");

        } else System.out.printf("Автомобиль %s завёлся\n", brand);
    }
}
