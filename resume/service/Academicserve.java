package com.resume.service;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.resume.model.Academic;

public class Academicserve {
		public static void profilestore(String course,String institution,String graduate_year,String percentage) throws ParseException {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			Academic a=new Academic();
			a.setCourses(course);
			a.setInstitution(institution);
			a.setGraduateyear(graduate_year);
			a.setPercentage(percentage);
			session.save(a);
			session.getTransaction().commit();
			session.close();	

}
}