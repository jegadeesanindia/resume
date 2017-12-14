package com.resume.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.resume.service.Basicservice;

/**
 * Servlet implementation class Basicprofile
 */
@WebServlet("/bs")
public class BasicprofileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BasicprofileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		String fname= request.getParameter("fname");
		String lname=request.getParameter("lname");
		String Father=request.getParameter("faname");
		String email=request.getParameter("email");
		String dob=request.getParameter("dob");
		try {
			Basicservice.profilestore(fname, lname, email, Father, dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}

}
}
