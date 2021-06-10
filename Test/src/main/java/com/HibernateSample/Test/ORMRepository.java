package com.HibernateSample.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ORMRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("vinod");
		emp.setSalary(20000);
		Configuration cfg= new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx= session.beginTransaction();
		session.save(emp);
		tx.commit();
	}

}
