package hw_16042021;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Product cabbage = new Product(4564321, "Капуста", 7);
        Product apple = new Product(6579089, "Яблоки", 10);
        Product appleGoldenDelicious = new Product(6579089, "Яблоки Golden", 11); //Яблоки с таким же id, но другими полями
        Product onion = new Product(2335484, "Лук", 8);
        Product turnip = new Product(3658698, "Репа", 4);


        Shop vitalur = new Shop(new ArrayList<Product>());
        ProductComparatorIncrease prcomp = new ProductComparatorIncrease();

        vitalur.addProduct(cabbage);
        vitalur.addProduct(apple);
        vitalur.addProduct(appleGoldenDelicious); // Не добавится, такой же id
        vitalur.addProduct(onion);
        vitalur.addProduct(turnip);
        vitalur.getAllProduct();

        ArrayList<Product> tmp = new ArrayList<>(vitalur.getProductList());         //Копируем исходный массив


        vitalur.getProductList().sort(prcomp); // Сортировка по возрастанию
        vitalur.getAllProduct();

        vitalur.removeProduct(6579089);
        vitalur.getAllProduct();


        Collections.reverse(tmp); // Сортировка по дате добавления
        System.out.println(tmp);

        vitalur.editProduct(4564321);
        vitalur.getAllProduct();


    }
}
