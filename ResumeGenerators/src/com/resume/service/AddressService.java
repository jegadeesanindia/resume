package com.resume.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.resume.model.CommunicationAddress;
import com.resume.model.PermanentAddress;

public class AddressService {
	public static void pemanentAddress(String doorno, String name, String village, String taluk, String city,
			String state, String country, int zipcode) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		PermanentAddress p = new PermanentAddress();
		p.setDoorNo(doorno);
		p.setName(name);
		p.setTaluk(taluk);
		p.setVillage(village);
		p.setCity(city);
		p.setVillage(village);
		p.setZipcode(zipcode);
		p.setState(state);
		p.setCountry(country);
		session.save(p);
		session.getTransaction().commit();
		session.close();
	}

	public static void Communicationaddress(String doorno, String name, String village, String taluk, String city,
			String state, String country, int zipcode) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		CommunicationAddress c = new CommunicationAddress();
		c.setDoorNo(doorno);
		c.setName(name);
		c.setTaluk(taluk);
		c.setVillage(village);
		c.setCity(city);
		c.setVillage(village);
		c.setZipcode(zipcode);
		c.setState(state);
		c.setCountry(country);
		session.save(c);
		session.getTransaction().commit();
		session.close();
	}

}
