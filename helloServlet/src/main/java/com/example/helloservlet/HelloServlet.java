package com.example.helloservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet implements Servlet {
    ServletConfig conf;

    //Lifecycle methods
    public void init(ServletConfig config) {
        System.out.println("Initiating servlet");
        this.conf = config;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//logic processing
        System.out.println("servicing ");
    }

    public void destroy() {
        System.out.println("Destroying servlet object");
    }

    //Non- lifecycle methods.
    public ServletConfig getServletConfig() {
        return this.conf;
    }

    public String getServletInfo() {
        return "getServletInfo method";
    }
}