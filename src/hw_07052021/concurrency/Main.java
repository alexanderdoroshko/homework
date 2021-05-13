package hw_07052021.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        JewelryStore jewelryStore = new JewelryStore();
        ConsumerGenerator consumerGenerator = new ConsumerGenerator(jewelryStore, 10);
        ConsumerExit consumerExit = new ConsumerExit(jewelryStore);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(consumerGenerator);
        service.execute(consumerExit);
        service.shutdown();


    }
}
