package by.teachmeskills.bootstrap.command;

import by.teachmeskills.bootstrap.model.Product;
import by.teachmeskills.bootstrap.exceptions.CommandException;

import javax.servlet.http.HttpServletRequest;

import static by.teachmeskills.bootstrap.PagesPathEnum.PRODUCT_PAGE;
import static by.teachmeskills.bootstrap.RequestParamsEnum.PRODUCT;
import static by.teachmeskills.bootstrap.RequestParamsEnum.PRODUCT_ID;

public class RedirectProductPageCommand implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        int productId = Integer.parseInt(request.getParameter(PRODUCT_ID.getValue()));
        Product product = new Product(productId, "Samsung Galaxy S8+", "Samsung Galaxy S8+", 1000,"fgfgfgfgfgfgfgfg");
        request.setAttribute(PRODUCT.getValue(), product);
        return PRODUCT_PAGE.getPath();

    }
}
