package hw_07052021.concurrency;

public class ConsumerExit implements Runnable {
    private JewelryStore jewelryStore;

    public ConsumerExit(JewelryStore jewelryStore) {
        this.jewelryStore = jewelryStore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((int) (Math.random() * (8000 - 1000 + 1)) + 1000);
                jewelryStore.get();

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            if (jewelryStore == null) {
                break;
            }
        }
    }
}
