package hw_26032021;

public class CivilAircraft extends AirTransport {
    private int numberPassage;
    private boolean hasBusinessClass;

    public CivilAircraft(double power, double maxSpeed, double weight, String brand, double wingspan,
                         double minimumRunwayLengthTakeOff, int numberPassage, boolean hasBusinessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunwayLengthTakeOff);
        this.numberPassage = numberPassage;
        this.hasBusinessClass = hasBusinessClass;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Airplane brand: %s, power engine: %.1f, max speed: %.1f, weight: %.1f, wingspan: %.2f, minimum runway length for take-off: %.1f, " +
                        "number of passage: %d, business class: %b, power kw: %.2f\n", brand, power, maxSpeed, weight, wingspan, minimumRunwayLengthTakeOff, numberPassage,
                hasBusinessClass, powerKw(power));
    }

    public void checkNumberPassage(int passage) {
        if (passage <= numberPassage) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
