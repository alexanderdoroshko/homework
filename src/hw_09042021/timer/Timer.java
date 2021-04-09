package hw_09042021.timer;

public class Timer {
    EventHandler handler;

    public Timer(EventHandler handler) {
        this.handler = handler;
    }

    public void starting() {
        handler.start();
    }
}
