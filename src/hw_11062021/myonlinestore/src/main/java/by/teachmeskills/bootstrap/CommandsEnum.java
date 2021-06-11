package by.teachmeskills.bootstrap;

public enum CommandsEnum {
    HOME_PAGE_COMMAND("start page"),
    SIGN_IN_COMMAND("sign-in"),
    CATEGORY_PAGE_COMMAND("category-redirect"),
    REDIRECT_SHOPPING_CART_COMMAND("redirect-to-shopping-cart"),
    REDIRECT_PRODUCT_COMMAND("product-redirect"),
    ADD_PRODUCT_TO_CART("add-product-to-cart");

    private final String command;

    CommandsEnum(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
