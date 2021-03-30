package hw_02042021;

import hw_02042021.hands.SamsungHand;
import hw_02042021.hands.SonyHand;
import hw_02042021.hands.ToshibaHand;
import hw_02042021.heads.SamsungHead;
import hw_02042021.heads.SonyHead;
import hw_02042021.heads.ToshibaHead;
import hw_02042021.legs.SamsungLeg;
import hw_02042021.legs.SonyLeg;
import hw_02042021.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        SonyHead sonyHead = new SonyHead(100);
        SamsungHead samsungHead = new SamsungHead(120);
        ToshibaHead toshibaHead = new ToshibaHead(90);

        SonyHand sonyHand = new SonyHand(80);
        SamsungHand samsungHand = new SamsungHand(90);
        ToshibaHand toshibaHand = new ToshibaHand(70);

        SonyLeg sonyLeg = new SonyLeg(80);
        SamsungLeg samsungLeg = new SamsungLeg(90);
        ToshibaLeg toshibaLeg = new ToshibaLeg(70);

        Robot robot1 = new Robot(sonyHead, samsungHand, toshibaLeg);
        robot1.action();
        System.out.println();

        Robot robot2 = new Robot(samsungHead, sonyHand, toshibaLeg);
        robot2.action();
        System.out.println();

        Robot robot3 = new Robot(toshibaHead, toshibaHand, sonyLeg);
        robot3.action();
        System.out.println();

        int expensiveRobot;
        if (robot1.getPrice() >= robot2.getPrice()) {
            expensiveRobot = robot1.getPrice();
        } else {
            expensiveRobot = robot2.getPrice();
        }

        if (expensiveRobot < robot3.getPrice()) {
            expensiveRobot = robot3.getPrice();
        }
        System.out.println("Самая большая цена " + expensiveRobot);


        if (expensiveRobot==robot1.getPrice()){
            System.out.println("Самый дорогой первый робот");
        }else if (expensiveRobot==robot2.getPrice()){
            System.out.println("Самый дорогой второй робот");
        }else if (expensiveRobot==robot3.getPrice()){
            System.out.println("Самый дорогой третий робот");
        }

    }
}
