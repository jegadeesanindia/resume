package com.resume.service;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.resume.model.Computerproficiency;

public class computerService {
	public static void comp(int R_id,int ID,String skills,int tag_id,String value) throws ParseException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Computerproficiency c=new Computerproficiency();
		c.setSkills(skills);
		c.setTagid(tag_id);
		c.setValue(value);
		session.save(c);
		session.getTransaction().commit();
		session.close();

}
}