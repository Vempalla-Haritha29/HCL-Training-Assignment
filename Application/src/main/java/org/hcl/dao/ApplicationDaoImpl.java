package org.hcl.dao;

import java.util.List;

import javax.persistence.Query;

import org.hcl.entities.Application;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ApplicationDaoImpl implements ApplicationDao {
   private SessionFactory sessionFactory;
   @Autowired
   public ApplicationDaoImpl(SessionFactory sessionFactory) {
	super();
	this.sessionFactory = sessionFactory;
}
public List<Application> getAll() {
	Session session=sessionFactory.getCurrentSession();
	Query query=session.createQuery("select a from org.hcl.entities.Application as a");
	List<Application> applications=query.getResultList();
	return applications;
	


}
}
