package com.mycompany.app.httpsession;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/datetime")
public class DateTimeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer= resp.getWriter();
        String start="<!DOCTYPE html><html><body>";
        String end=" </body> </html>";
        writer.print(start);
        Date date = new Date();
        writer.println("<h2>"+"System Date and Time: " +date.toString()+"</h2>");
        writer.print(end);
    }
}