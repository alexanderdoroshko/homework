package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.PagesPathEnum;
import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.model.Category;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static by.teachmeskills.myeshop.RequestParamsEnum.CATEGORY;

public class HomePageCommandImpl implements BaseCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {

        List<Category> categories = getCategories();
        request.setAttribute(CATEGORY.getValue(), categories);
        return PagesPathEnum.HOME_PAGE.getPath();
    }

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



