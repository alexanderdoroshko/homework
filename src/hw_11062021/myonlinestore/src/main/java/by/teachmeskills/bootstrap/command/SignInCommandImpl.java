package by.teachmeskills.bootstrap.command;

import by.teachmeskills.bootstrap.PagesPathEnum;
import by.teachmeskills.bootstrap.RequestParamsEnum;
import by.teachmeskills.bootstrap.exceptions.CommandException;
import by.teachmeskills.bootstrap.exceptions.RequestParamNullException;
import by.teachmeskills.bootstrap.model.Category;
import by.teachmeskills.bootstrap.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static by.teachmeskills.bootstrap.RequestParamsEnum.CATEGORY;
import static by.teachmeskills.bootstrap.utils.HttpRequestParamValidator.ValidateParamNotNull;

public class SignInCommandImpl implements BaseCommand {
    private static final String ADMIN_LOGIN = "admin";
    private static final String ADMIN_PASSWORD = "admin";

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        User user = getUser();
        return checkReceivedUser(user, request);
    }

    private User getUser() {
        return new User(ADMIN_LOGIN, ADMIN_PASSWORD);
    }

    private String checkReceivedUser(User user, HttpServletRequest request) throws RequestParamNullException {
        String login = request.getParameter(RequestParamsEnum.LOGIN.getValue());
        String password = request.getParameter(RequestParamsEnum.PASSWORD.getValue());

        ValidateParamNotNull(login);
        ValidateParamNotNull(password);

        if (user != null && login.equals(ADMIN_LOGIN) && password.equals(ADMIN_PASSWORD)) {
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

            request.setAttribute(CATEGORY.getValue(), categories);

            return PagesPathEnum.HOME_PAGE.getPath();
        } else {
            return PagesPathEnum.SIGN_IN_PAGE.getPath();
        }
    }
}
