package com.jsfmrydvd.login;
import com.jsfmrydvd.register.UserService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Josef David on 7:23 PM, 10/10/2018
 **/
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("name").toLowerCase();
        String finalUserName = userName.substring(0,1).toUpperCase() + userName.substring(1).toLowerCase();
        String password = request.getParameter("password");
        if(UserService.isUserValid(userName, password)) {
            request.getSession().setAttribute("name", finalUserName);
            response.sendRedirect("/home");
        } else {
            request.setAttribute("errorMessage", "Invalid Username and Password");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
        }
    }
}
