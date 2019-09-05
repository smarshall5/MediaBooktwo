package edu.wctc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet1",urlPatterns = "/hello")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pp= request.getParameter("param2");
        String message2 =  "<html><body>"+ pp +"</body></html>";
        response.getWriter().print(message2);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String p= request.getParameter("param1");

        String message =  "<html><body>"+ p +"</body></html>";
        response.getWriter().print(message);


    }
}
