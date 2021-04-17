package hw_16042021;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        ApplicationMenu applicationMenu = new ApplicationMenu();


        try {
            applicationMenu.start();
        } catch (IOException e) {
            e.getMessage();
        }


    }
}
