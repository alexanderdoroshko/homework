package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.exceptions.CommandException;

import javax.servlet.http.HttpServletRequest;

public interface BaseCommand {
    String execute(HttpServletRequest request) throws CommandException;
}
