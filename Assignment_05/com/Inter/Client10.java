package com.Inter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import com.HibernetConfig.InterHiber;
import com.entity.Employee;

public class Client10 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = InterHiber.sfs();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.ne("salary","14000"));
		
		List<Employee> list = criteria.list();
		
		for(Employee employee:list) {
			System.out.println(employee);
		}
		
		tr.commit();
		session.close();
	}
}
