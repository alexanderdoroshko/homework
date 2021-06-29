package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.PagesPathEnum;
import by.teachmeskills.myeshop.dao.domain.Product;
import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.utils.ProductGenerator;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class SearchProductCommandImpl implements BaseCommand{
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String searchProduct = request.getParameter("productType");
        System.out.println(searchProduct);

        ProductGenerator productGenerator = new ProductGenerator();
        List<Product> allProducts = productGenerator.getAllProduct();
        Product findItems = null;

        for (Product p : allProducts) {
            if (p.getName().equalsIgnoreCase(searchProduct)) {
                findItems = p;
            }
        }

        List<Product> listSearchProduct = new ArrayList<>();
        listSearchProduct.add(findItems);

        request.setAttribute("products", listSearchProduct);

        return PagesPathEnum.CATEGORY_PAGE.getPath();
    }
}
