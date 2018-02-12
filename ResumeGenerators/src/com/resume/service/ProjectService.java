package com.resume.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.resume.model.Project;

public class ProjectService {
	public static void pro(String title, String status,String Description)
	{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Project p=new Project();
		p.setTitle(title);
		p.setDescription(Description);
		p.setTitle(title);
		session.save(p);
		session.getTransaction().commit();
		session.close();
	}
}
