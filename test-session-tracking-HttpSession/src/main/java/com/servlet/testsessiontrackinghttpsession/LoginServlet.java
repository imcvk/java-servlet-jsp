package com.servlet.testsessiontrackinghttpsession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    PrintWriter out;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session;
        out = response.getWriter();
         request.getRequestDispatcher("link.html").include(request, response);
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        if (password.equals("abc")) {
            out.print("<h1>Welcome " + name + "</h1>");
            session = request.getSession();
            session.setAttribute("name", name);
        } else {
            out.println("Sorry,Incorrect password");
        }
        out.close();
    }
}
