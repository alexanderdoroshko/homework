package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.PagesPathEnum;
import by.teachmeskills.myeshop.dao.domain.Category;
import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.utils.CategoryGenerator;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class SearchCategoryCommandImpl implements BaseCommand{
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String searchCategoryType = request.getParameter("categoryType");
        System.out.println(searchCategoryType);

        CategoryGenerator categoryGenerator = new CategoryGenerator();
        List<Category> categories = categoryGenerator.getCategories();
        Category searchCategory = null;

        for (Category c:categories){
            if (c.getName().equalsIgnoreCase(searchCategoryType)){
                searchCategory = c;
            }
        }
        List<Category> listSearchCategory = new ArrayList<>();
        listSearchCategory.add(searchCategory);

        request.setAttribute("categories",listSearchCategory);

        return PagesPathEnum.HOME_PAGE.getPath();
    }
}
