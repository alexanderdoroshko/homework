package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.PagesPathEnum;
import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.model.Category;
import by.teachmeskills.myeshop.utils.CategoryGenerator;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static by.teachmeskills.myeshop.RequestParamsEnum.CATEGORY;

public class HomePageCommandImpl implements BaseCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {

        CategoryGenerator categoryGenerator = new CategoryGenerator();

        List<Category> categories = categoryGenerator.getCategories();

        request.setAttribute(CATEGORY.getValue(), categories);
        return PagesPathEnum.HOME_PAGE.getPath();
    }
}



