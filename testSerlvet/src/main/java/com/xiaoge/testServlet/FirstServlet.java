package com.xiaoge.testServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("what is up mofo");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        boolean result = validate(userName,password);
        if(result){
            resp.getWriter().append("Hello " + userName);
        }else{
            resp.getWriter().append("Please Try again. Credential Incorrect");
        }

    }

    private boolean validate(String userName, String password) {
        return userName.equals("admin") && password.equals("admin");
    }
}
