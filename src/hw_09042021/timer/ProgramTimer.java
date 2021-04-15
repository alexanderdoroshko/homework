package hw_09042021.timer;

public class ProgramTimer {
    public static void main(String[] args) {
        Timer timer = new Timer(new StartTimer());
        timer.starting();
    }
}
