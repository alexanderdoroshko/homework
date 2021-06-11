package by.teachmeskills.bootstrap.command;

import by.teachmeskills.bootstrap.exceptions.CommandException;
import by.teachmeskills.bootstrap.model.Cart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static by.teachmeskills.bootstrap.PagesPathEnum.CART_PAGE;
import static by.teachmeskills.bootstrap.RequestParamsEnum.SHOPPING_CART;
import static by.teachmeskills.bootstrap.RequestParamsEnum.SHOPPING_CART_PRODUCTS;

public class RedirectToShoppingCart implements BaseCommand{
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute(SHOPPING_CART.getValue());

        if (cart == null) {
            request.setAttribute(SHOPPING_CART_PRODUCTS.getValue(), "");
        } else {
            request.setAttribute(SHOPPING_CART_PRODUCTS.getValue(), cart.getProducts());
        }

        return CART_PAGE.getPath();

    }
}
