package com.resume.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.resume.model.JobExperience;

public class JobexperienceService {
	public static void Job(String nameOfJob,String job,String exp)
	{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		JobExperience j=new JobExperience();
		j.setExperience(exp);
		j.setJob(job);
		j.setNameofjob(nameOfJob);
		session.save(j);
		session.getTransaction().commit();
		session.close();
		
	}

}
