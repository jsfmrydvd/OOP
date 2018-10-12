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
        homeService.delete(new Todo(request.getParameter("todo")));
        response.sendRedirect("/home");
    }
}