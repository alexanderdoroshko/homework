package by.teachmeskills.bootstrap.command;

import by.teachmeskills.bootstrap.exceptions.CommandException;

import javax.servlet.http.HttpServletRequest;

public interface BaseCommand {
    String execute (HttpServletRequest request) throws CommandException;
}
