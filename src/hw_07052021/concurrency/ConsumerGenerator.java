package hw_07052021.concurrency;

public class ConsumerGenerator implements Runnable {
    private JewelryStore jewelryStore;
    private int consumerCount;
    private static int id = 1;

    public ConsumerGenerator(JewelryStore jewelryStore, int consumerCount) {
        this.jewelryStore = jewelryStore;
        this.consumerCount = consumerCount;
    }

    private int getId() {
        return id++;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < consumerCount) {
            count++;
            jewelryStore.add(new Consumer(getId()));
            try {
                Thread.sleep(2000);      //Покупатель в пути
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            if (count == consumerCount) {
                break;
            }
        }
    }
}


