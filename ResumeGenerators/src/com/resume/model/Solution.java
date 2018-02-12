package com.resume.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		UserCredential u=new UserCredential();
		u.setEmailid("jegadeesan@gmail.com");
		u.setPassword("9677516470");
		BasicProfile b=new BasicProfile();
		b.setFirstname("jegadees");
		b.setLastname("san");
		b.setFathername("sundharam");
		//b.setDOB(12/14/2017);
		b.setEmailid(u.getEmailid());
		b.setAge(21);
		b.setVisible(false);		
		Set <Academic> a=new HashSet<>();
		Academic c=new Academic();
		c.setCourses("BE");
		c.setGraduateyear("2019");
		c.setInstitution("kce");
		c.setPercentage("85");
		a.add(c);
		b.setAcadmey(a);
		Set <Computerproficiency> comp=new HashSet<>();
		Computerproficiency d=new Computerproficiency();
		d.setSkills("programming");
		d.setTagid(1);
		d.setValue("c");
		comp.add(d);
		b.setComputer(comp);
		Set <JobExperience> job=new HashSet<>();
		JobExperience j=new JobExperience();
		j.setExperience("2years");
		j.setJob("Developer");
		j.setNameofjob("Developer");
		job.add(j);
		b.setJob(job);
		Set <Project> p=new HashSet<>();
		Project e=new Project();
		e.setDescription("voting machine");
		e.setStatus("finished");
		e.setTitle("emmbedded systems");
		p.add(e);
		b.setProject(p);
		Set <Address> add=new HashSet<>();
		CommunicationAddress com=new CommunicationAddress();
		com.setVillage("ayr");
		com.setCity("dindigul");
		com.setTaluk("vs");
		com.setCountry("india");
		com.setZipcode(624801);
		com.setState("tn");
		PermanentAddress per=new PermanentAddress();
		per.setVillage("ayr");
		per.setCity("dindigul");
		per.setState("tn");
		per.setCountry("india");
		per.setZipcode(624810);
		per.setTaluk("vs");
		add.add(com);
		add.add(per);
		b.setAdd(add);
		session.beginTransaction();
		session.save(b);
		session.save(u);
		session.getTransaction().commit();
		session.close();
	}

}
