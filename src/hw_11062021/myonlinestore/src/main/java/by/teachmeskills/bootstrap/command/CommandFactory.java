package by.teachmeskills.bootstrap.command;

import by.teachmeskills.bootstrap.CommandsEnum;
import by.teachmeskills.bootstrap.RequestParamsEnum;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static final Map<String,BaseCommand> COMMAND_LIST = new HashMap<>();

    static {
        COMMAND_LIST.put(CommandsEnum.HOME_PAGE_COMMAND.getCommand(), new HomePageCommandImpl());
        COMMAND_LIST.put(CommandsEnum.SIGN_IN_COMMAND.getCommand(), new SignInCommandImpl());
        COMMAND_LIST.put(CommandsEnum.ADD_PRODUCT_TO_CART.getCommand(), new AddProductToCartCommand());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_SHOPPING_CART_COMMAND.getCommand(), new RedirectToShoppingCart());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_PRODUCT_COMMAND.getCommand(), new RedirectProductPageCommand());
    }

    public static BaseCommand defineCommand(HttpServletRequest request){
        String commandKey = request.getParameter(RequestParamsEnum.COMMAND.getValue());
        if (commandKey == null|| commandKey.isEmpty()){
            commandKey = CommandsEnum.SIGN_IN_COMMAND.getCommand();
        }

        return COMMAND_LIST.get(commandKey);
    }

}
