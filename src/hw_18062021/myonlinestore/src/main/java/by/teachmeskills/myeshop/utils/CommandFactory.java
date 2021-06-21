package by.teachmeskills.myeshop.utils;

import by.teachmeskills.myeshop.CommandsEnum;
import by.teachmeskills.myeshop.RequestParamsEnum;
import by.teachmeskills.myeshop.command.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static final Map<String, BaseCommand> COMMAND_LIST = new HashMap<>();

    static {
        COMMAND_LIST.put(CommandsEnum.HOME_PAGE_COMMAND.getCommand(), new HomePageCommandImpl());
        COMMAND_LIST.put(CommandsEnum.SIGN_IN_COMMAND.getCommand(), new SignInCommandImpl());
        COMMAND_LIST.put(CommandsEnum.ADD_PRODUCT_TO_CART.getCommand(), new AddProductToCartCommand());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_SHOPPING_CART_COMMAND.getCommand(), new RedirectToShoppingCart());
        COMMAND_LIST.put(CommandsEnum.CATEGORY_PAGE_COMMAND.getCommand(), new CategoryRedirectCommandImpl());
        COMMAND_LIST.put(CommandsEnum.REGISTRATION_COMMAND.getCommand(), new RegistrationRedirectCommandImpl());
        COMMAND_LIST.put(CommandsEnum.ACCOUNT_COMMAND.getCommand(), new AccountPageCommandImpl());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_PRODUCT_COMMAND.getCommand(), new ProductRedirectCommandImpl());
        COMMAND_LIST.put(CommandsEnum.REMOVE_PRODUCT_TO_CART.getCommand(), new RemoveProductToCartCommand());

    }

    public static BaseCommand defineCommand(HttpServletRequest request) {
        String commandKey = request.getParameter(RequestParamsEnum.COMMAND.getValue());
        if (commandKey == null || commandKey.isEmpty()) {
            commandKey = CommandsEnum.SIGN_IN_COMMAND.getCommand();
        }

        return COMMAND_LIST.get(commandKey);
    }

}
