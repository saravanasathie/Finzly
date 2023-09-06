package com.basic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.HibernetConfig.Hiber;
import com.entity.Login;

public class Client1 {
	public static void main(String[] args) {
		System.out.println("---------------------------------");
		
		SessionFactory sf = Hiber.sf();	
		
		Session session = sf.openSession();	
		
		Login log1 = session.load(Login.class, 1);
		Login log2 = session.get(Login.class, 2);
		
		System.out.println(log1);
		System.out.println(log2);
		
		
		session.close();
		
	}
}
