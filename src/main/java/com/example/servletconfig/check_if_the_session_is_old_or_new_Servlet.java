package com.example.servletconfig;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "check_if_the_session_is_old_or_new_Servlet", value = "/check_if_the_session_is_old_or_new_Servlet")
public class check_if_the_session_is_old_or_new_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("test session attributes<br>");
        /*
        getSession() returns a session no matter
        what.... but you can’t tell if it’s a new
        session unless you ask the session.
         */
        HttpSession session = request.getSession();
        /*
        isNew() returns true if the
        client has not yet responded
        with this session ID.
         */
        if (session.isNew()) {
            out.println("This is a new session.");
        } else {
            out.println("Welcome back!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
