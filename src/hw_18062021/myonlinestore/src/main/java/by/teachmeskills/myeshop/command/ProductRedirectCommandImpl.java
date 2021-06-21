package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.PagesPathEnum;
import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.model.Product;
import by.teachmeskills.myeshop.utils.ProductGenerator;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static by.teachmeskills.myeshop.RequestParamsEnum.PRODUCT;
import static by.teachmeskills.myeshop.RequestParamsEnum.PRODUCT_ID;

public class ProductRedirectCommandImpl implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {

        int productId = Integer.parseInt(request.getParameter(PRODUCT_ID.getValue()));

        ProductGenerator productGenerator = new ProductGenerator();
        List<Product> allItems = productGenerator.getAllProduct();

        Product findItems = null;

        for (Product p : allItems) {
            if (p.getId() == productId) {
                findItems = p;
            }
        }

        request.setAttribute(PRODUCT.getValue(), findItems);

        return PagesPathEnum.PRODUCT_PAGE.getPath();
    }
}
