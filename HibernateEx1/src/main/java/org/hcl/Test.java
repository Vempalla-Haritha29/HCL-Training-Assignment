package org.hcl;

import org.hcl.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Student st = new Student(1, "Archana", "Nlr");
		Transaction transaction = session.beginTransaction();
		// session.persist(st);
	    Integer i = (Integer)session.save(st);
		transaction.commit();
		session.close();
				 
	}

}
