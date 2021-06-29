package by.teachmeskills.myeshop.utils;

import by.teachmeskills.myeshop.dao.domain.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryGenerator {

    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();

        Category mobilePhones = Category.categoryBuilder().withId(1).withName("Mobile phones").withRating(1).withImagePath("mobile.jpg").build();
        Category laptops = Category.categoryBuilder().withId(2).withName("Laptop").withRating(1).withImagePath("laptop.jpg").build();
        Category fridge = Category.categoryBuilder().withId(3).withName("Fridges").withRating(2).withImagePath("fridge.jpg").build();
        Category cameras = Category.categoryBuilder().withId(4).withName("Cameras").withRating(4).withImagePath("camera.jpg").build();
        Category gpsNavigators = Category.categoryBuilder().withId(5).withName("GPS navigators").withRating(4).withImagePath("gps-nav.jpg").build();
        Category cars = Category.categoryBuilder().withId(6).withName("Car").withRating(3).withImagePath("car.jpg").build();


        categories.add(mobilePhones);
        categories.add(laptops);
        categories.add(fridge);
        categories.add(cameras);
        categories.add(gpsNavigators);
        categories.add(cars);

        return categories;
    }
}
