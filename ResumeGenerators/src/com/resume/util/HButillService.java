package com.resume.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HButillService {
	private static SessionFactory sf;

	public static Session getSession() {
		if (sf == null) {
			sf = new Configuration().configure().buildSessionFactory();
			return sf.openSession();
		}
		return null;
	}

}