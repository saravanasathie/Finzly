package com.HibernetConfig;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public final class InterHiber {
	private InterHiber() {}
	public static SessionFactory sfs()  {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		return sessionFactory;
	}
}
