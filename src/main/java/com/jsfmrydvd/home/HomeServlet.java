package com.jsfmrydvd.home;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Josef David on 10:47 AM, 10/12/2018
 **/
@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet {

     HomeService homeService = new HomeService();
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        request.setAttribute("todos", homeService.retrieveTodos());
        request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String todoList = request.getParameter("todo");
        homeService.add(new Todo(todoList));
        response.sendRedirect("/home");
    }
}
