package com.sessiontrackingdemo.sessiontrackingdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        if (password.equals("abc")) {
            out.println("Welcome," + name);
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
        } else {
            out.println("Sorry, incorrect password");
            request.getRequestDispatcher("login.html").include(request, response);
        }
        out.close();
    }
}
