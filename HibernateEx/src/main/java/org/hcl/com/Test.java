package org.hcl.com;

import org.hcl.entities.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Configuration configuration=new Configuration();
    configuration.configure("hibernate.cfg.xml");
    SessionFactory factory=configuration.buildSessionFactory();
    Session session=factory.openSession();
    Employee e=new Employee(2,"Sita","Nlr");
    Transaction transaction=session.beginTransaction();
    Integer i=(Integer)session.save(e);
    transaction.commit();
    System.out.println("the employee with no "+i+" inserted successfully");
	}

}
