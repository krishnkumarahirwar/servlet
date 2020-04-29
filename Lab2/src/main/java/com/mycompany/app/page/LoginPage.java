package com.mycompany.app.page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/processlogin")
public class LoginPage extends HttpServlet {
	
	String username="krishna";
	String password="gautam";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer= resp.getWriter();
        String start="<!DOCTYPE html><html><body>";
        String end=" </body> </html>";
        writer.print(start);
        String usernameValue=req.getParameter("username");
        String passwordValue=req.getParameter("password");
        if(usernameValue.equals(username) && passwordValue.equals(password)) {
        writer.print(" Login Successfull ,  <a href='home'>Click to visit Home</a> ");
        }
        HttpSession session= req.getSession();
        session.setAttribute("username",usernameValue);
        session.setAttribute("password" ,passwordValue);
        writer.print(end);
    }
}