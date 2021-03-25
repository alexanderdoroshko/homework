package hw_26032021;

public class MilitaryAircraft extends AirTransport {
    private boolean ejectionSystem;
    private int numberRocket;

    public MilitaryAircraft(double power, double maxSpeed, double weight, String brand, double wingspan, double minimumRunwayLengthTakeOff,
                            boolean ejectionSystem, int numberRocket) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunwayLengthTakeOff);
        this.ejectionSystem = ejectionSystem;
        this.numberRocket = numberRocket;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Airplane brand: %s, power engine: %.1f, max speed: %.1f, weight: %.1f, wingspan: %.2f, minimum runway length for take-off: %.1f, " +
                        "ejection system: %b, number of rocket: %d, power kw: %.2f\n", brand, power, maxSpeed, weight, wingspan, minimumRunwayLengthTakeOff, ejectionSystem,
                numberRocket, powerKw(power));
    }

    public void shot(int rocket) {
        if (rocket > 0) {
            while (rocket > 0) {
                System.out.println("Ракета пошла");
                rocket--;
            }
        }
        System.out.println("Боеприпасы отсутствуют");
    }

    public void ejection(boolean ejectionSystem) {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У Вас нет такой системы");
        }
    }
}
