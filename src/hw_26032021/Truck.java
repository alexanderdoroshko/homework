package hw_26032021;

public class Truck extends LandTransport {
    private double loadCapacity;

    public Truck(double power, double maxSpeed, double weight, String brand, int numberWheels, double fuelConsumption, double loadCapacity) {
        super(power, maxSpeed, weight, brand, numberWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Car brand: %s, power engine: %.1f, max speed: %.1f, weight: %.1f, number of wheels: %d, fuel consumption: %.1f, load capacity: %.2f, power kw: %.2f\n",
                brand, power, maxSpeed, weight, numberWheels, fuelConsumption, loadCapacity, powerKw(power));
    }

    public void checkLoadCapacity(double weightCargo) {
        if (weightCargo <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
