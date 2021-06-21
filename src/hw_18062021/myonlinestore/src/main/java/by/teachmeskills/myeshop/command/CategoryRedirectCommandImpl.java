package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.PagesPathEnum;
import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.model.Product;
import by.teachmeskills.myeshop.utils.ProductGenerator;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class CategoryRedirectCommandImpl implements BaseCommand {

    ProductGenerator productGenerator = new ProductGenerator();


    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String categoryType = request.getParameter("categoryType");

        switch (categoryType) {
            case ("Mobile phones"): {
                List<Product> products = productGenerator.getProductMobile();
                request.setAttribute("products", products);
                break;
            }
            case ("Laptop"): {
                List<Product> products = productGenerator.getProductLaptop();
                request.setAttribute("products", products);
                break;
            }
            case ("Fridges"): {
                List<Product> products = productGenerator.getProductFridges();
                request.setAttribute("products", products);
                break;
            }
            case ("Cameras"): {
                List<Product> products = productGenerator.getProductCamera();
                request.setAttribute("products", products);
                break;
            }
            case ("GPS navigators"): {
                List<Product> products = productGenerator.getProductGps();
                request.setAttribute("products", products);
                break;
            }
            case ("Car"): {
                List<Product> products = productGenerator.getProductCar();
                request.setAttribute("products", products);
                break;
            }
        }
        return PagesPathEnum.CATEGORY_PAGE.getPath();
    }
}
