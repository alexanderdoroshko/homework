package hw_26032021;

public class CivilAircraft extends AirTransport {
    private int passengersNumber;
    private boolean isBusinessClass;

    public CivilAircraft(double power, double maxSpeed, double weight, String brand, double wingspan,
                         double minimumRunwayLengthTakeOff, int passengersNumber, boolean isBusinessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunwayLengthTakeOff);
        this.passengersNumber = passengersNumber;
        this.isBusinessClass = isBusinessClass;
    }

    @Override
    public void displayInfo() {
        System.out.printf("\n Марка самолета: %s, мощность двигателя: %.1f, max скорость: %.1f, масса: %.1f, размах крыльев: %.2f, минимальная длина взлетно-посадочной полосы: %.1f, " +
                        "число пассажиров: %d, наличие бизнесс класса: %b, мощность двигателя в киловаттах: %.2f\n", brand, power, maxSpeed, weight, wingspan, minimumRunwayLength, passengersNumber,
                isBusinessClass, powerKw(power));
    }

    public void checkNumberPassage(int passage) {
        if (passage <= passengersNumber) {
            System.out.println("\n Самолет загружен");
        } else {
            System.out.println("\n Вам нужен самолет побольше");
        }
    }
}
