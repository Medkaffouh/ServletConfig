package com.example.servletconfig;

import javax.servlet.*;
public class MyServletContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        //code to initialize the database connection
        //and store it as a context attribute
    }
    public void contextDestroyed(ServletContextEvent event) {
        //code to close the database connection
    }
}
