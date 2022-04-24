package com.servletjsp.urlrewriting;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "servlet1", value = "/servlet1")
public class servlet1 extends HttpServlet {
    private String name;

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("username");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Name is:" + name + "</h1>");
        out.println("<a href='secondServlet?user="+name+"'>Go to secondServlet</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}