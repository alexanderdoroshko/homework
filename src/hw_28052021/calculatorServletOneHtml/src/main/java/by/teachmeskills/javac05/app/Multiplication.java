package by.teachmeskills.javac05.app;

import by.teachmeskills.javac05.model.Calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/multiplication")
public class Multiplication extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Calculator calculator = new Calculator();
        String num1 = req.getParameter("number1");
        String num2 = req.getParameter("number2");
        double num1Double = Double.parseDouble(num1);
        double num2Double = Double.parseDouble(num2);
        resp.getWriter().write("Multiplication " + calculator.multiplication(num1Double, num2Double));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/calculator.html");
        dispatcher.forward(req, resp);
    }
}
