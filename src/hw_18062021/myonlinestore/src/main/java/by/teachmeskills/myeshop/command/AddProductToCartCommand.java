package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.model.Cart;
import by.teachmeskills.myeshop.model.Product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static by.teachmeskills.myeshop.PagesPathEnum.PRODUCT_PAGE;
import static by.teachmeskills.myeshop.RequestParamsEnum.*;

public class AddProductToCartCommand implements BaseCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        int productId = Integer.parseInt(request.getParameter(PRODUCT_ID.getValue()));

        List<Product> allItems = new ArrayList<>();

        CategoryRedirectCommandImpl categoryRedirectCommand = new CategoryRedirectCommandImpl();
        List<Product> mobile = categoryRedirectCommand.getProductMobile();
        List<Product> laptop = categoryRedirectCommand.getProductLaptop();
        List<Product> camera = categoryRedirectCommand.getProductCamera();
        List<Product> gps = categoryRedirectCommand.getProductGps();
        List<Product> car = categoryRedirectCommand.getProductCar();
        List<Product> fridge = categoryRedirectCommand.getProductFridges();

        allItems.addAll(mobile);
        allItems.addAll(laptop);
        allItems.addAll(camera);
        allItems.addAll(gps);
        allItems.addAll(car);
        allItems.addAll(fridge);

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
