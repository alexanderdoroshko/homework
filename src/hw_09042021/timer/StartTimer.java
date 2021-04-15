package hw_09042021.timer;

public class StartTimer implements EventHandler {
    @Override
    public void start() {
        System.out.println("Таймер запущен");
        while (true) {
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.getMessage();
            }
            System.out.println("Прошло 10 секунд");
        }
    }
}
