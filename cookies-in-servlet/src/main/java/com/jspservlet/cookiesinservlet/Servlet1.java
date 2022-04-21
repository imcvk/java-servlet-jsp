package com.jspservlet.cookiesinservlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "servlet1", value = "/servlet1")
public class Servlet1 extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Welcome " + request.getParameter("name") + "</h1>");
        out.println("<h1> <a href='Servlet2'>Go to servlet 2</a> </h1>");
        out.println("</body></html>");
//create a cookie
        Cookie cookie=new Cookie("name",request.getParameter("name"));
        response.addCookie(cookie);
    }

    public void destroy() {
    }
}