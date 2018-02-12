package com.resume.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.model.UserCredential;
import com.resume.service.Loginservice;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/ls")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try(PrintWriter out=response.getWriter()){
			String mailid=request.getParameter("mailid");
			String passwd=request.getParameter("password");
			if(request.getParameter("type").equals("login"))
			{
			UserCredential u=Loginservice.login(mailid, passwd);
			if(u.getPassword().equals(passwd)) {
				Cookie ck=new Cookie("mailid",mailid);
				response.addCookie(ck);
				HttpSession ses=request.getSession();
				ses.setAttribute("mailid", mailid);
				request.getRequestDispatcher("Front.jsp").include(request, response);
			}
			else
			{
				out.write("Invalid login details");
			}
		}
			else if(request.getParameter("type").equals("signup"))
			{
				Loginservice.signup(mailid, passwd);
				Cookie ck=new Cookie("mailid",mailid);
				response.addCookie(ck);
				HttpSession ses=request.getSession();
				ses.setAttribute("mailid", mailid);
				request.getRequestDispatcher("Front.jsp").include(request, response);
				
			}
			else {
				out.write("hi");
			}
		}
	}

}
