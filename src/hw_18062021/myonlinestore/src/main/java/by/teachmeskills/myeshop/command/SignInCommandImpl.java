package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.PagesPathEnum;
import by.teachmeskills.myeshop.RequestParamsEnum;
import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.exceptions.RequestParamNullException;
import by.teachmeskills.myeshop.model.Category;
import by.teachmeskills.myeshop.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static by.teachmeskills.myeshop.RequestParamsEnum.CATEGORY;
import static by.teachmeskills.myeshop.utils.HttpRequestParamValidator.ValidateParamNotNull;

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
            HomePageCommandImpl homePageCommand = new HomePageCommandImpl();
            List<Category> categories = homePageCommand.getCategories();

            request.setAttribute(CATEGORY.getValue(), categories);

            return PagesPathEnum.HOME_PAGE.getPath();
        } else {
            return PagesPathEnum.SIGN_IN_PAGE.getPath();
        }
    }
}
