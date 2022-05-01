package com.j2ee.employeemgmtsystem.registration.controller;

import com.j2ee.employeemgmtsystem.registration.dao.EmployeeDAO;
import com.j2ee.employeemgmtsystem.registration.model.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    EmployeeDAO employeeDAO = new EmployeeDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        try {
            Employee e = employeeDAO.authorize(username, password);
            if (!e.equals(null)) {
                HttpSession session = request.getSession();
                session.setAttribute("name", "Chaitanya");
                response.setContentType("text/html");
                if (username.equals(e.getUsername()) && password.equals(e.getPassword())) {
                    out.println("<h1> Authorized</h1>");
                }
            } else {
                out.println("<h1>Not Authorized</h1>");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
