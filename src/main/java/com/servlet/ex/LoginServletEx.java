package com.servlet.ex;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/login")
/*public class LoginServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try {
			String s1 = req.getParameter("uname");
			String s2 = req.getParameter("pword");
			PrintWriter pw = res.getWriter();
			pw.println("<html><body bgcolor=yellow text=green><h3>");
			pw.println("username is " + s1 + "<br>");
			pw.println("password is " + s2);
			pw.println("</h3></body></html>");
			pw.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}*/

//@WebServlet("/login")
public class LoginServletEx extends HttpServlet  {
	public void doPost(HttpServletRequest  req, HttpServletResponse res) {
		try {
	          res.setContentType("text/html");  

			String s1 = req.getParameter("uname");
			String s2 = req.getParameter("pword");
			PrintWriter pw = res.getWriter();
			pw.println("<html><body bgcolor=yellow text=green><h3>");
			pw.println("username is " + s1 + "<br>");
			pw.println("password is " + s2);
			pw.println("</h3></body></html>");
			pw.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}