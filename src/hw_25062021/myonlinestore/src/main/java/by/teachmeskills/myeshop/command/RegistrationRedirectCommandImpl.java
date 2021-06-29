package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.PagesPathEnum;
import by.teachmeskills.myeshop.exceptions.CommandException;

import javax.servlet.http.HttpServletRequest;

public class RegistrationRedirectCommandImpl implements BaseCommand{
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        return PagesPathEnum.REGISTRATION_PAGE.getPath();
    }
}
