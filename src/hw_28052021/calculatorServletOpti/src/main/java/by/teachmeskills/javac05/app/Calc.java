package by.teachmeskills.javac05.app;

import by.teachmeskills.javac05.model.Calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")
public class Calc extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Calculator calculator = new Calculator();
        String num1 = req.getParameter("number1");
        String num2 = req.getParameter("number2");
        double num1Double = Double.parseDouble(num1);
        double num2Double = Double.parseDouble(num2);
        String operation = req.getParameter("operation");

        switch (operation) {
            case "summa":
                resp.getWriter().write("Summa " + calculator.summa(num1Double, num2Double));
                break;
            case "subtraction":
                resp.getWriter().write("subtraction " + calculator.subtraction(num1Double, num2Double));
                break;
            case "multiplication":
                resp.getWriter().write("multiplication " + calculator.multiplication(num1Double, num2Double));
                break;
            case "division":
                resp.getWriter().write("division " + calculator.division(num1Double, num2Double));
                break;
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/calculator.html");
        dispatcher.forward(req, resp);
    }
}
