package com.basic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.HibernetConfig.Hiber;
import com.entity.Login;

public class Client3 {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = Hiber.sf();
		
		Session session = sessionFactory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Login log = new Login();
		
		log.setId(3);
		log.setUsername("sk");
		log.setPassword("12211");
		
		session.update(log);
		tr.commit();
		session.close();
	}
}
