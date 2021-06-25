package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.model.Cart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static by.teachmeskills.myeshop.PagesPathEnum.CART_PAGE;
import static by.teachmeskills.myeshop.RequestParamsEnum.SHOPPING_CART;
import static by.teachmeskills.myeshop.RequestParamsEnum.SHOPPING_CART_PRODUCTS;

public class RedirectToShoppingCart implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute(SHOPPING_CART.getValue());

        if (cart == null) {
            request.setAttribute(SHOPPING_CART_PRODUCTS.getValue(), "");
        } else {
            request.setAttribute(SHOPPING_CART_PRODUCTS.getValue(), cart.getProducts()); //"cartProductList
        }

        int totalPrice;                                 //Расчет итоговой стоимости
        if (cart == null) {
            totalPrice = 0;
        } else {
            totalPrice = cart.getTotalPrice();
        }

        request.setAttribute("totalPrice", totalPrice);

        return CART_PAGE.getPath();
    }
}
