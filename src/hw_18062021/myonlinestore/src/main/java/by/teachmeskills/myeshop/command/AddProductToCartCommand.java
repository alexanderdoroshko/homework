package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.model.Cart;
import by.teachmeskills.myeshop.model.Product;
import by.teachmeskills.myeshop.utils.ProductGenerator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

import static by.teachmeskills.myeshop.PagesPathEnum.PRODUCT_PAGE;
import static by.teachmeskills.myeshop.RequestParamsEnum.PRODUCT_ID;
import static by.teachmeskills.myeshop.RequestParamsEnum.SHOPPING_CART;
import static by.teachmeskills.myeshop.RequestParamsEnum.PRODUCT;


public class AddProductToCartCommand implements BaseCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        int productId = Integer.parseInt(request.getParameter(PRODUCT_ID.getValue()));

        ProductGenerator productGenerator = new ProductGenerator();
        List<Product> allItems = productGenerator.getAllProduct();

        Product findItems = null;

        for (Product p : allItems) {
            if (p.getId() == productId) {
                findItems = p;
            }
        }

        Cart cart;
        Object objCart = session.getAttribute("cart");

        if (objCart != null) {
            cart = (Cart) objCart;
        } else {
            cart = new Cart();
            session.setAttribute(SHOPPING_CART.getValue(), cart); //"cart"
        }

        cart.addProduct(findItems);
        request.setAttribute(PRODUCT.getValue(), findItems);     //"product"


        return PRODUCT_PAGE.getPath();
    }
}
