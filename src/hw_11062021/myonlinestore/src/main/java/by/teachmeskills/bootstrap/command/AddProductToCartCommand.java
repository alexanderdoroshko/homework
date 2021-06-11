package by.teachmeskills.bootstrap.command;

import by.teachmeskills.bootstrap.model.Cart;
import by.teachmeskills.bootstrap.model.Product;
import by.teachmeskills.bootstrap.exceptions.CommandException;
import by.teachmeskills.bootstrap.utils.HardCodeServletProduct;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static by.teachmeskills.bootstrap.PagesPathEnum.PRODUCT_PAGE;
import static by.teachmeskills.bootstrap.RequestParamsEnum.*;

public class AddProductToCartCommand implements BaseCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        int productId = Integer.parseInt(request.getParameter(PRODUCT_ID.getValue()));
        System.out.println(productId);

        List<Product> allItems = new ArrayList<>();

        HardCodeServletProduct hardCodeServletProduct = new HardCodeServletProduct();
        List<Product> mobile = hardCodeServletProduct.getProductMobile();
        List<Product> laptop = hardCodeServletProduct.getProductLaptop();
        List<Product> camera = hardCodeServletProduct.getProductCamera();
        List<Product> gps = hardCodeServletProduct.getProductGps();
        List<Product> car = hardCodeServletProduct.getProductCar();
        List<Product> fridge = hardCodeServletProduct.getProductFridges();

        allItems.addAll(mobile);
        allItems.addAll(laptop);
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
            session.setAttribute(SHOPPING_CART.getValue(), cart);
        }

        cart.addProduct(findItems);
        request.setAttribute(PRODUCT.getValue(), findItems);

        return PRODUCT_PAGE.getPath();
    }
}
