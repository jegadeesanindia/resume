package com.resume.service;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.resume.model.UserCredential;

public class Signupservice {
	public static void signup(String mailid,String pass)
	{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
   UserCredential u=new UserCredential();
   u.setEmailid(mailid);
   u.setPassword(pass);
	session.save(u);
	session.getTransaction().commit();
	session.close();
   
	}
}
