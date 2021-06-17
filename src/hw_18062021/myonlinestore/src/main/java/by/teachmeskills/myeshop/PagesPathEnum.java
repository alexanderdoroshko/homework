package by.teachmeskills.myeshop;

public enum PagesPathEnum {
    HOME_PAGE("home.jsp"),
    SIGN_IN_PAGE("signin.jsp"),
    CART_PAGE("cart.jsp"),
    PRODUCT_PAGE("product.jsp"),
    REGISTRATION_PAGE("registration.jsp"),
    ACCOUNT_PAGE("personalaccount.jsp"),
    CATEGORY_PAGE("category.jsp");

    private final String path;

    PagesPathEnum(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
