package com.usermgmt.usermgmtapplication.web;

import com.usermgmt.usermgmtapplication.dao.UserDAO;
import com.usermgmt.usermgmtapplication.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        User u = new User(request.getParameter("userInputName"), request.getParameter("userInputEmail1"), request.getParameter("userInputCountry"));
        boolean r = false;
        UserDAO userDAO = new UserDAO();
        try {
            r = userDAO.registerUser(u);
            out.println("<h1>User created</h1>");
        } catch (Exception e) {
            out.println("<h1>User not created</h1>");
            e.printStackTrace();
        }
    }
}
