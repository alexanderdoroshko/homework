package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.model.Cart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static by.teachmeskills.myeshop.PagesPathEnum.CART_PAGE;
import static by.teachmeskills.myeshop.RequestParamsEnum.PRODUCT_ID;
import static by.teachmeskills.myeshop.RequestParamsEnum.SHOPPING_CART;

public class RemoveProductToCartCommand implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        int productId = Integer.parseInt(request.getParameter(PRODUCT_ID.getValue()));

        Cart cart;
        Object objCart = session.getAttribute("cart");

        if (objCart != null) {
            cart = (Cart) objCart;
        } else {
            cart = new Cart();
            session.setAttribute(SHOPPING_CART.getValue(), cart); //"cart"
        }

        cart.removeProduct(productId);

        RedirectToShoppingCart redirectToShoppingCart = new RedirectToShoppingCart();  //Переотрисовка корзины
        redirectToShoppingCart.execute(request);

        return CART_PAGE.getPath();
    }
}
