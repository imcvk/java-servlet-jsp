package com.j2ee.employeemgmtsystem.registration.controller;

import com.j2ee.employeemgmtsystem.registration.dao.EmployeeDAO;
import com.j2ee.employeemgmtsystem.registration.model.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EmployeeServlet", value = "/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/Login.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            String contact = request.getParameter("contact");
            String address = request.getParameter("address");
            Employee e = new Employee(firstName, lastName, userName, password, contact, address);
            boolean r = employeeDAO.registerEmployee(e);

            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/EmployeeCreated.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
