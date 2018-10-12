package com.jsfmrydvd.login;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Josef David on 11:50 AM, 10/12/2018
 **/
@WebFilter(urlPatterns = {"/home", "/todo-delete","/logout"})
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        if (request.getSession().getAttribute("name") != null) {
            filterChain.doFilter(servletRequest,servletResponse);
        } else {
            request.getRequestDispatcher("/login").forward(servletRequest,servletResponse);
        }

    }
    @Override
    public void destroy() {
    }
}
