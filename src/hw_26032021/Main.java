package hw_26032021;

public class Main {
    public static void main(String[] args) {
        Cars skoda = new Cars(150, 227, 1800, "Skoda Octavia", 4, 5.8, "Sedan", 5);


        Truck kamaz = new Truck(428, 150, 7990, "Kamaz-5490", 4, 30, 35.935);


        CivilAircraft airbus = new CivilAircraft(3500, 945, 560000, "Airbus a380", 79.75,
                2050, 525, true);


        MilitaryAircraft sukhoi = new MilitaryAircraft(2500, 2778, 50000, "Sukhoi-35", 14.75,
                450, true, 30);


        Transport[] trs = {skoda, kamaz, airbus, sukhoi};
        for (Transport tr: trs){
            tr.displayInfo();
        }

        skoda.pathMaxSpeed(5.5);
        kamaz.checkLoadCapacity(35.1);
        airbus.checkNumberPassage(700);
        sukhoi.shot(4);
        sukhoi.ejection(true);
    }
}
