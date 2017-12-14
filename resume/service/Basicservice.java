package com.resume.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.resume.model.Basicprofile;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Basicservice {
	public static void profilestore(String fname,String lname,String email,String father,String date) throws ParseException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Basicprofile b=new Basicprofile();
		b.setFirstname(fname);
		b.setLastname(lname);
		b.setEmailid(email);
		b.setDOB(date);
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
	    Date startDate = df.parse(date);
	    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	    Date cur_date = new Date();
		b.setAge(Basicservice.calculateAge(startDate, cur_date));
		b.setFathername(father);
		session.save(b);
		session.getTransaction().commit();
	}
	public static int calculateAge(Date date, Date currentDate) {
        if ((date != null) && (currentDate != null)) {
        	return currentDate.getYear()-date.getYear();
        } else {
            return 0;
        }
    }
}
