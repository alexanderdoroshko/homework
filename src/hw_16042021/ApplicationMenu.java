package hw_16042021;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ApplicationMenu {


    public ApplicationMenu() {
    }



    public void start() throws IOException {
        Shop evroopt = new Shop(new ArrayList<Product>());
        ProductComparatorIncrease pci = new ProductComparatorIncrease();
        ProductComparatorDecrease pcd = new ProductComparatorDecrease();
        Product cabbage = new Product(4564321, "Капуста", 7);
        Product apple = new Product(6579089, "Яблоки", 10);
        Product onion = new Product(2335484, "Лук", 8);
        Product turnip = new Product(3658698, "Репа", 4);

        evroopt.addProduct(cabbage);
        evroopt.addProduct(apple);
        evroopt.addProduct(onion);
        evroopt.addProduct(turnip);



        for (; ; ) {

            System.out.println("Добро пожаловать в магазин!\n");
            System.out.println("Выберите действие. Нажмите:");
            System.out.println("1 Для вывода всех товаров");
            System.out.println("2 Добавление товара");
            System.out.println("3 Удаление товара");
            System.out.println("4 Редактирование товара");
            System.out.println("Нажмите q- выход из магазина");
            Scanner choice = new Scanner(System.in);

            String str = choice.nextLine();
            if (str.equals("q")) break;




            switch (str) {
                case "1":
                    System.out.println("Выберите сортировку");
                    System.out.println("1 по цене(возрастание)");
                    System.out.println("2 по цене(убывание)");
                    System.out.println("3 по добавлению(сначала новые, потом более старые)");

                    switch (choice.nextInt()) {
                        case 1:
                            evroopt.getProductList().sort(pci);
                            System.out.println(evroopt.getProductList());
                            break;
                        case 2:
                            evroopt.getProductList().sort(pcd);
                            System.out.println(evroopt.getProductList());
                            break;
                        case 3:
                            Collections.reverse(evroopt.getProductList());
                            System.out.println(evroopt.getProductList());
                            break;
                        default:
                            System.out.println("Некорректный ввод");
                    }

                    break;

                case "2":
                    System.out.println("Введите параметры товара: id, название цена");
                    Product productUser = new Product(choice.nextInt(), choice.nextLine(), choice.nextInt());
                    for (Product p: evroopt.getProductList())
                        if (p.getId() == productUser.getId()) {
                            System.out.println("Товар с таким id уже есть в списке");
                        }else {
                            evroopt.getProductList().add(productUser);
                        }

                    break;
                case "3":
                    System.out.println("Введите id товара, который хотите удалить");
                    evroopt.removeProduct(choice.nextInt());
                    break;
                case "4":
                    System.out.println("Введите id товара, который хотите отредактировать");
                    evroopt.correctedProduct(choice.nextInt());
                    break;
                default:
                    System.out.println("Некорректный ввод");
            }
        }
    }
}
