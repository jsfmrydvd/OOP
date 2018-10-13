package com.jsfmrydvd.home;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Josef David on 10:06 AM, 10/12/2018
 **/
@WebServlet(urlPatterns = "/todo-delete")
public class TodoDelete extends HttpServlet {
     HomeService homeService = new HomeService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String names = (String) request.getSession().getAttribute("name");
        if(request.getParameter("todo").contains(names)) {
            homeService.delete(new Todo(request.getParameter("todo")));
            response.sendRedirect("/home");
        } else {
            request.setAttribute("errorMessage", "You can only delete your own message!");
            request.setAttribute("todos", homeService.retrieveTodos());
            request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
        }

    }
}