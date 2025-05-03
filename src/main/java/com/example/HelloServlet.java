package com.example;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello,World");
    }
}
