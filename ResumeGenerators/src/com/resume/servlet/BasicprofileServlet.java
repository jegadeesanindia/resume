package com.resume.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.resume.service.Basicservice;

@WebServlet("/bs")
public class BasicprofileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BasicprofileServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		String fname= request.getParameter("fname");
		String lname=request.getParameter("lname");
		String father=request.getParameter("faname");
		String email=request.getParameter("email");
		@SuppressWarnings("deprecation")
		Date dob=new Date(Integer.parseInt(request.getParameter("date")),Integer.parseInt(request.getParameter("month")),Integer.parseInt(request.getParameter("year")));
		String status=request.getParameter("status");
		try {
			Basicservice.profilestore(fname, lname, email, father, dob, status);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}
}
