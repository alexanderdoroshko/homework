package hw_26032021;

public class Truck extends LandTransport {
    private double loadCapacity;

    public Truck(double power, double maxSpeed, double weight, String brand, int numberWheels, double fuelConsumption, double loadCapacity) {
        super(power, maxSpeed, weight, brand, numberWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.printf("\n Марка грузовика: %s, мощность двигателя: %.1f, max скорость: %.1f, масса: %.1f, количество колес: %d, расход топлива: %.1f, грузоподъемность: %.2f, мощность двигателя в киловаттах: %.2f\n",
                brand, power, maxSpeed, weight, numberWheels, fuelConsumption, loadCapacity, powerKw(power));
    }

    public void checkLoadCapacity(double weightCargo) {
        if (weightCargo <= loadCapacity) {
            System.out.println("\n Грузовик загружен");
        } else {
            System.out.println("\n Вам нужен грузовик побольше");
        }
    }
}
