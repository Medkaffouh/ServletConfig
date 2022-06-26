package com.example.servletconfig;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "pre_existing_session_Servlet", value = "/pre_existing_session_Servlet")
public class pre_existing_session_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("test sessions<br>");
        /*Passing “false” means the method
        returns a pre-existing session,
        or null if there was no session
        associated with this client.*/
        HttpSession session = request.getSession(false);
        /*Now we can test for whether
        there was already a session
        (the no-arg getSession()
        would NEVER return null).*/
        if (session==null) {
            out.println("no session was available");
            out.println("making one...");
        // Here we KNOW we’re making a new session
            session = request.getSession();
        } else {
            out.println("there was a session!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
