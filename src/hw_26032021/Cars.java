package hw_26032021;

public class Cars extends LandTransport {
    private String bodyType;
    private int numberPassage;

    public Cars(double power, double maxSpeed, double weight, String brand, int numberWheels, double fuelConsumption, String bodyType, int numberPassage) {
        super(power, maxSpeed, weight, brand, numberWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberPassage = numberPassage;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Car brand: %s, power engine: %.1f, max speed: %.1f, weight: %.1f, number of wheels: %d, fuel consumption: %.1f, " +
                        "body type: %s, number of passenger: %d,power kw: %.2f\n",
                brand, power, maxSpeed, weight, numberWheels, fuelConsumption, bodyType, numberPassage, powerKw(power));
    }

    public void pathMaxSpeed(double time) {
        double pathMaxSpeed = time * maxSpeed;
        System.out.printf("За время %.1f ч, автомобиль %s, двигаясь с максимальной скоростью %.1f км/ч проедет %.1f км и израсходует %.1f литров топлива.\n",
                time, brand, maxSpeed, pathMaxSpeed, fuelConsumptionTime(time));
    }

    private double fuelConsumptionTime(double time) {
        return time * maxSpeed * fuelConsumption / 100;
    }

}
