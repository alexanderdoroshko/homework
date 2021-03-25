package hw_26032021;

public abstract class AirTransport extends Transport {
    protected double wingspan;
    protected double minimumRunwayLengthTakeOff;

    public AirTransport(double power, double maxSpeed, double weight, String brand, double wingspan, double minimumRunwayLengthTakeOff) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minimumRunwayLengthTakeOff = minimumRunwayLengthTakeOff;
    }
}

