package com.servlets.servletusinghttpservlet;

import java.io.*;
import javax.servlet.http.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HttpServletDemo extends HttpServlet {
    private String message;

    public void init() {
        message = "Init Method in Servlet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }

}