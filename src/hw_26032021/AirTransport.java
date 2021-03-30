package hw_26032021;

public abstract class AirTransport extends Transport {
    protected double wingspan;
    protected double minimumRunwayLength;

    public AirTransport(double power, double maxSpeed, double weight, String brand, double wingspan, double minimumRunwayLength) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minimumRunwayLength = minimumRunwayLength;
    }
}

