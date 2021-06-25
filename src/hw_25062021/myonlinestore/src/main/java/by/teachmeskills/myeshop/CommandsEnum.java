package by.teachmeskills.myeshop;

public enum CommandsEnum {
    HOME_PAGE_COMMAND("start page"),
    SIGN_IN_COMMAND("sign-in"),
    CATEGORY_PAGE_COMMAND("category-redirect"),
    REDIRECT_SHOPPING_CART_COMMAND("redirect-to-shopping-cart"),
    REDIRECT_PRODUCT_COMMAND("product-redirect"),
    ADD_PRODUCT_TO_CART("add-product-to-cart"),
    REGISTRATION_COMMAND("redirect-to-registration-form"),
    ACCOUNT_COMMAND("redirect-to-account"),
    REMOVE_PRODUCT_TO_CART("remove-product-to-cart"),
    REDIRECT_FILTER_SEARCH("redirect-to-filter-search"),
    SEARCH_CATEGORY("categorySearch"),
    SEARCH_PRODUCT("productSearch");


    private final String command;

    CommandsEnum(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
