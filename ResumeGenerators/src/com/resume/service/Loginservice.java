package com.resume.service;

import org.hibernate.Session;

import com.resume.model.UserCredential;
import com.resume.util.HButillService;
import com.resume.util.Utility;

public class Loginservice {
	public static UserCredential login(String mailid,String pass)
	{
		Session session = HButillService.getSession();
		UserCredential u=session.get(UserCredential.class, mailid);
		return u;
	}
	public static void signup(String mailid,String pass) {
		Session s=HButillService.getSession();
		UserCredential u=new UserCredential();
		s.beginTransaction();
		u.setEmailid(mailid);
		u.setPassword(pass);
		s.getTransaction().commit();
		s.close();
		
	}
	
	public static boolean forgetpass(String mailid) {
		Session session=HButillService.getSession();
		session.beginTransaction();
		UserCredential u=session.get(UserCredential.class, mailid);
		if(u!=null) {
			String key=Utility.generateKey(10);
			u.setKey(key);
			EmailService.send(mailid,"<h1>Recovery Mail</h1>" ,"Your Verification code: "+key);
			session.update(u);
			session.getTransaction().commit();
			return true;
		}
		return false;
	}
	public static boolean newpass(String mailid,String key,String newpass) {
		Session session=HButillService.getSession();
		session.beginTransaction();
		UserCredential u=session.get(UserCredential.class, mailid);
		if(u.getKey().equals(key)) {
			u.setPassword(newpass);
			u.setKey("");
			session.getTransaction().commit();
			return true;
		}
		return false;
	}

}