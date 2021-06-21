package by.teachmeskills.myeshop.utils;

import by.teachmeskills.myeshop.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryGenerator {

    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        Category mobilePhones = new Category("Mobile phones", "mobile.jpg");
        Category laptops = new Category("Laptop", "laptop.jpg");
        Category fridge = new Category("Fridges", "fridge.jpg");
        Category cameras = new Category("Cameras", "camera.jpg");
        Category gpsNavigators = new Category("GPS navigators", "gps-nav.jpg");
        Category cars = new Category("Car", "car.jpg");

        categories.add(mobilePhones);
        categories.add(laptops);
        categories.add(fridge);
        categories.add(cameras);
        categories.add(gpsNavigators);
        categories.add(cars);

        return categories;
    }
}
