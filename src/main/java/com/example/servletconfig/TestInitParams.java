package com.example.servletconfig;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestInitParams extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("test init parameters<br>");

        java.util.Enumeration e = getServletConfig().getInitParameterNames();

        while(e.hasMoreElements()) {
            out.println("<br>param name = " + e.nextElement() + "<br>");
        }
        out.println("This is a init param");
        out.println("<br>");
        out.println("main email is " + getServletConfig().getInitParameter("mainEmail"));
        out.println("<br>");
        out.println("This is a context param");
        out.println("<br>");
        out.println("admin email is " + getServletContext().getInitParameter("adminEmail"));
    }
}

