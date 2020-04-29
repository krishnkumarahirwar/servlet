package com.mycompany.app.page;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class HomePage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer= resp.getWriter();
        String start="<!DOCTYPE html><html><body>";
        String end=" </body> </html>";
        writer.print(start);
        HttpSession session= req.getSession();
        Object usernameValue=session.getAttribute("username");
        String out=" welcome "+ usernameValue;
        writer.print(out);
        writer.print(end);
    }
}