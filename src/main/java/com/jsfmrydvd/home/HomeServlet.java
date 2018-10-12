package com.jsfmrydvd.home;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        String name = (String) request.getSession().getAttribute("name");
        PrintWriter out = new PrintWriter(name);
        out.print("<html><font color=\\\"red\\\">" + name +"</font></html>");
        String todoList = request.getParameter("todo");
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
        Date date = new Date();
        homeService.add(new Todo(name +": " + todoList + " " + "("+ formatter.format(date) +")"));
        response.sendRedirect("/home");
    }
}
