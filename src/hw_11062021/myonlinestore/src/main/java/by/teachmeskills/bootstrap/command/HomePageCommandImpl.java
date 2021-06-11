package by.teachmeskills.bootstrap.command;

import by.teachmeskills.bootstrap.PagesPathEnum;
import by.teachmeskills.bootstrap.exceptions.CommandException;

import javax.servlet.http.HttpServletRequest;

public class HomePageCommandImpl implements BaseCommand{

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        return PagesPathEnum.HOME_PAGE.getPath();
    }
}
