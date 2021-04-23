package hw_23042021;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CarSerialization {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Car.dat"))) {
            Car lada = new Car("Lada", 180, 13_000);
            oos.writeObject(lada);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Car.dat"))){
            Car ladaRead = (Car) ois.readObject();
            System.out.printf("Brand: %s, speed:  %d, price: %d\n", ladaRead.getBrand(), ladaRead.getSpeed(), ladaRead.getPrice());

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
