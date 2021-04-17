package hw_16042021;

import java.util.ArrayList;
import java.util.Scanner;


public class Shop {
    private ArrayList<Product> productList;


    public Shop(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Shop() {

    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        boolean contain = false;
        for (Product p : productList) {
            if (p.getId() == product.getId()) {
                contain = true;
                break;
            }
        }
        if (!contain) {
            productList.add(product);
        } else {
            System.out.println("Товар с таким id уже находится в магазине\n");
        }
    }

    public void getAllProduct() {
        System.out.println(productList.toString());
    }


    public void removeProduct(int id) {
        boolean contain = false;
        for (Product p : productList) {
            if (p.getId() == id) {
                contain = true;
                productList.remove(p);
                break;
            }
        }
        if (contain) {
            System.out.println("Товар удален из магазина\n");
        } else {
            System.out.println("Товара с таким id в магазине нет\n");
        }
    }

    public void correctedProduct(int id) {
        boolean contain = false;
        for (Product p : productList) {
            if (p.getId() == id) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите новое название товара");
                String name = sc.nextLine();
                System.out.println("Введите новую цену товара");
                int price = sc.nextInt();
                Product p1 = new Product(id, name, price);
                productList.set(productList.indexOf(p), p1);
                contain = true;
            }
        }
        if (contain) {
            System.out.println("Замена проведена успешно\n");
        } else {
            System.out.println("Товара с таким id в магазине нет\n");
        }
    }


    @Override
    public String toString() {
        return "Shop{" +
                "productList=" + productList +
                '}';
    }
}
