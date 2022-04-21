package com.jspservlet.cookiesinservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet2", value = "/Servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        boolean f = false;
        String name = "";
        Cookie cookies[] = request.getCookies();
        if (cookies.equals(null)) {
            out.println("<h1>You are a new user</h1>");
            return;
        } else {
            for (Cookie c : cookies) {
                String Cname = c.getName();
                if (Cname.equals("name")) {
                    f = true;
                    name = c.getValue();
                }
            }
        }
        if (f) {
            out.println("<html><body>");
            out.println("<h1> Welcome " + name + " to servlet 2</h1>");
        } else {
            out.println("<h1>You are a new user</h1>");
        }
        out.println("</body></html>");

    }
}
