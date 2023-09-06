package com.Inter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;

import java.util.List;

import com.HibernetConfig.InterHiber;
import com.entity.Employee;

public class Client17 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = InterHiber.sfs();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.setProjection(Projections.property("name"));
		
		List<Employee> list = criteria.list();
		System.out.println(list);
		
		tr.commit();
		session.close();
	}
}
