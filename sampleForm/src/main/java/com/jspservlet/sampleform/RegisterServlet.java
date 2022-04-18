package com.jspservlet.sampleform;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "registerServlet", value = "/registerServlet")
public class RegisterServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "initiated..";
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        // Hello
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("username");
        String email = req.getParameter("password");
        String password = req.getParameter("email");
        String course = req.getParameter("courses");
        String gender = req.getParameter("gender");
        String terms = req.getParameter("termsAndConditions");
        if (terms.equals("checked")) {
            out.println("<h1>" + "name:" + name + "</h1>");
            out.println("<h1>" + "email:" + email + "</h1>");
            out.println("<h1>" + "password:" + password + "</h1>");
            out.println("<h1>" + "course:" + course + "</h1>");
            out.println("<h1>" + "gender:" + gender + "</h1>");


        } else {
            out.println("<h1>" + "You have not accepted terms and conditions" + "</h1>");
        }

    }

    public void destroy() {
    }
}