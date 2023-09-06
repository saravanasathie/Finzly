package com.basic;

import org.hibernate.*;

import com.HibernetConfig.Hiber;
import com.entity.Login;

public class Client2 {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = Hiber.sf();
		Session session = sessionFactory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Login login = new Login();
		
		login.setId(4);
		login.setUsername("Mithul");
		login.setPassword("adsdfff");
		
		session.save(login);
		
		tr.commit();
		session.close();
	}
}
