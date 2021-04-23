package hw_23042021;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private int speed;
    private  int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }
}
