package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "Result: ---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstNum0 = request.getParameter("firstNum");
        String secondNum0 = request.getParameter("secondNum");
        request.setAttribute("FirstNum", firstNum0);
        request.setAttribute("SecondNum", secondNum0);

        if (firstNum0.equals("") || firstNum0 == null || secondNum0.equals("") || secondNum0 == null) {
            request.setAttribute("message", "Result: invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        } else {

            int firstNum = Integer.parseInt(firstNum0);
            int secondNum = Integer.parseInt(secondNum0);

            if (request.getParameter("plus") != null) {
                int result = firstNum + secondNum;
                request.setAttribute("message", "Result: " + result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            } else if (request.getParameter("minus") != null) {
                int result = firstNum - secondNum;
                request.setAttribute("message", "Result: " + result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            } else if (request.getParameter("times") != null) {
                int result = firstNum * secondNum;
                request.setAttribute("message", "Result: " + result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            } else if (request.getParameter("modulo") != null) {
                int result = firstNum % secondNum;
                request.setAttribute("message", "Result: " + result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }

        }

    }
}
