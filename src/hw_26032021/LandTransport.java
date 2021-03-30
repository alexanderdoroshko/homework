package hw_26032021;

public abstract class LandTransport extends Transport {
    protected int numberWheels;
    protected double fuelConsumption;

    public LandTransport(double power, double maxSpeed, double weight, String brand, int numberWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.numberWheels = numberWheels;
        this.fuelConsumption = fuelConsumption;
    }
}
