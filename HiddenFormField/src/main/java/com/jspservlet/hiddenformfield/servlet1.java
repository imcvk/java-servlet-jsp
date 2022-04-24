package com.jspservlet.hiddenformfield;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlet1", value = "/servlet1")
public class servlet1 extends HttpServlet {
    private String name;

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
         name = request.getParameter("username");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Name is:" + name + "</h1>");

        out.println("<form action='secondServlet'>" +
                "<input type='hidden' name='userName' value='"+name+"'/>" +
                "<button type='submit'>Go to second Servlet</button>" +
                "</form>");


        out.println("</body></html>");
    }

    public void destroy() {
    }
}