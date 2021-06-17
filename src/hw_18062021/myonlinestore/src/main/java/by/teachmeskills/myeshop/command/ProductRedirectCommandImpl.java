package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.PagesPathEnum;
import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.model.Product;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static by.teachmeskills.myeshop.RequestParamsEnum.PRODUCT;
import static by.teachmeskills.myeshop.RequestParamsEnum.PRODUCT_ID;

public class ProductRedirectCommandImpl implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
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

        request.setAttribute(PRODUCT.getValue(), findItems);


        return PagesPathEnum.PRODUCT_PAGE.getPath();
    }
}
