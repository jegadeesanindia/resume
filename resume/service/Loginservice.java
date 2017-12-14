package com.resume.service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.resume.model.UserCredential;

public class Loginservice {
	public static void login(HttpServletResponse response,String mailid,String pass)
	{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		UserCredential u=session.get(UserCredential.class, mailid);
		if (u != null && u.getPassword().equals(pass)) {
			Cookie cookie = new Cookie("auth_user", "");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			cookie = new Cookie("auth_key", mailid);
			cookie.setMaxAge(24*60*60);
			response.addCookie(cookie);
			//html dispatcher
		}
		else
		{
			//html dispatcher
		}
	
	}

}