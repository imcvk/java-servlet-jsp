package com.jspservlet.registrationmodule.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String name = request.getParameter("userName");
        String password = request.getParameter("password");
        out.println(email + "," + name + "," + password);
        //jdbc connection
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/study","root","root");
       String q="insert into user(name,password,email) values(?,?,?)";
            PreparedStatement psmt=con.prepareStatement(q);
            psmt.setString(1,name);
            psmt.setString(2,password);
            psmt.setString(3,email);
            psmt.execute();
            System.out.println("done...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //query execution
    }
}
