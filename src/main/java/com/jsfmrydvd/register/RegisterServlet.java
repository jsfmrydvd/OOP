package com.jsfmrydvd.register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Josef David on 2:17 PM, 10/11/2018
 **/
@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    RegisterService reg = new RegisterService();
    UserService userService = new UserService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("name").toLowerCase();
        String password = request.getParameter("password");
        if(!userService.isUserTaken(userName,password)) {
            userService.addUser(userName, password);
            response.sendRedirect("/login");
        } else {
            request.setAttribute("errorMessage", "Username is already taken!");
            request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request,response);
        }

    }
}
