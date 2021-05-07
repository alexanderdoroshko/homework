package hw_07052021.concurrency;

import java.util.ArrayDeque;

public class JewelryStore {
    private ArrayDeque<Consumer> listConsumer;
    private static final int maxConsumerInShop = 5;
    private static final int minConsumerInShop = 0;
    private int consumerCounter;

    public JewelryStore() {
        listConsumer = new ArrayDeque<>();
    }

    public synchronized boolean add(Consumer consumer) {
        try {
            if (consumerCounter < maxConsumerInShop) {
                notifyAll();
                listConsumer.add(consumer);
                System.out.printf("Покупатель %d зашел в магазин\n", consumer.getId());
                consumerCounter++;

            } else if (consumerCounter < 4) {
                try {
                    System.out.println("Магазин закрыт на перерыв");
                    Thread.currentThread().join(10000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            } else {
                System.out.println("В магазине нет места");
                wait();
                return false;
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public synchronized void get() {
        if (consumerCounter > minConsumerInShop) {
            notifyAll();
            Consumer c = listConsumer.removeFirst();
            consumerCounter--;
            System.out.printf("Покупатель " + c.getId() + " покинул магазин\n");
        }
    }
}





