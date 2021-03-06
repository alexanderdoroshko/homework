package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.PagesPathEnum;
import by.teachmeskills.myeshop.RequestParamsEnum;
import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.exceptions.RequestParamNullException;
import by.teachmeskills.myeshop.dao.domain.Category;
import by.teachmeskills.myeshop.model.UserAdmin;
import by.teachmeskills.myeshop.utils.CategoryGenerator;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static by.teachmeskills.myeshop.RequestParamsEnum.CATEGORY;
import static by.teachmeskills.myeshop.utils.HttpRequestParamValidator.ValidateParamNotNull;

public class SignInCommandImpl implements BaseCommand {
    private static final String ADMIN_LOGIN = "admin";
    private static final String ADMIN_PASSWORD = "admin";

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        UserAdmin userAdmin = getUserAdmin();
        return checkReceivedUser(userAdmin, request);
    }

    private UserAdmin getUserAdmin() {
        return new UserAdmin(ADMIN_LOGIN, ADMIN_PASSWORD);
    }

    private String checkReceivedUser(UserAdmin userAdmin, HttpServletRequest request) throws RequestParamNullException {
        String login = request.getParameter(RequestParamsEnum.LOGIN.getValue());
        String password = request.getParameter(RequestParamsEnum.PASSWORD.getValue());

        ValidateParamNotNull(login);
        ValidateParamNotNull(password);

        if (userAdmin != null && login.equals(ADMIN_LOGIN) && password.equals(ADMIN_PASSWORD)) {
            CategoryGenerator categoryGenerator = new CategoryGenerator();
            List<Category> categories = categoryGenerator.getCategories();

            request.setAttribute(CATEGORY.getValue(), categories);

            return PagesPathEnum.HOME_PAGE.getPath();
        } else {
            return PagesPathEnum.SIGN_IN_PAGE.getPath();
        }
    }
}
