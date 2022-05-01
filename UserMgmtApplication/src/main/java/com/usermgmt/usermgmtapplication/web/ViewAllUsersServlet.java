package com.usermgmt.usermgmtapplication.web;

import com.usermgmt.usermgmtapplication.dao.UserDAO;
import com.usermgmt.usermgmtapplication.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ViewAllUsersServlet", value = "/ViewAllUsersServlet")
public class ViewAllUsersServlet extends HttpServlet {
    PrintWriter out;



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDAO userDAO = new UserDAO();
        out = response.getWriter();
        try {
            List<User> users = userDAO.getAll();
            out.println(users);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
