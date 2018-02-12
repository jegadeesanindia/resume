package com.resume.service;

import org.hibernate.Session;
import com.resume.model.BasicProfile;
import com.resume.util.HButillService;
import java.text.ParseException;
import java.util.Date;

public class Basicservice {
	public static void profilestore(String fname,String lname,String email,String father,Date dob,String status) throws ParseException {
		Session session = HButillService.getSession();
		BasicProfile b=new BasicProfile();
		b.setFirstname(fname);
		b.setLastname(lname);
		b.setEmailid(email);
        b.setDOB(dob);
	    Date cur_date = new Date();
		b.setAge(Basicservice.calculateAge(dob, cur_date));
		b.setFathername(father);
		session.save(b);
		session.getTransaction().commit();
	}
	@SuppressWarnings("deprecation")
	public static int calculateAge(Date date, Date currentDate) {
        if ((date != null) && (currentDate != null)) {
        	return currentDate.getYear()-date.getYear();
        } else {
            return 0;
        }
    }
	public static String hi() {
		return "Hi";
	}
}
