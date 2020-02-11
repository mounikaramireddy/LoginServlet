package com.servlet.ex;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/login")
public class LoginServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try {
			String s1 = req.getParameter("uname");
			String s2 = req.getParameter("pword");
			PrintWriter pw = res.getWriter();
			pw.println("<html><body bgcolor=yellow text=green><h3>");
			pw.println("username is " + s1 + "<br>");
			pw.println("password is " + s2);
			pw.println("</h3></body></html>");

		} catch (Exception e) {
			System.err.println(e);
		}
	}
}