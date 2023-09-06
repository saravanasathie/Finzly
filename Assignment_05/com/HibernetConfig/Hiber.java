package com.HibernetConfig;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Login;

public final class Hiber {
	private Hiber() {}
	public static SessionFactory sf()  {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Login.class);
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		return sessionFactory;
	}
}
