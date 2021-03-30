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
        System.out.printf("\n Марка самолета: %s, мощность двигателя: %.1f, max скорость: %.1f, масса: %.1f, размах крыльев: %.2f, минимальная длина взлетно-посадочной полосы: %.1f, " +
                        "система катапультирования: %b, количество ракет: %d, мощность двигателя в киловаттах: %.2f\n", brand, power, maxSpeed, weight, wingspan, minimumRunwayLength, ejectionSystem,
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
            System.out.println("\n Катапультирование прошло успешно");
        } else {
            System.out.println("\n У Вас нет такой системы");
        }
    }
}
