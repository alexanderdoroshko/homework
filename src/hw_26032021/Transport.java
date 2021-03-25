package hw_26032021;

public abstract class Transport {
    protected double power;
    protected double maxSpeed;
    protected double weight;
    protected String brand;

    public Transport(double power, double maxSpeed, double weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public void displayInfo() {
    }

    public double powerKw(double power) {
        return power * 0.74;
    }
}
