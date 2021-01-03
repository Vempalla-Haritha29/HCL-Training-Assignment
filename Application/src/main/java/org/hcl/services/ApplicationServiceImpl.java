package org.hcl.services;

import java.util.List;

import org.hcl.dao.ApplicationDao;
import org.hcl.entities.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ApplicationServiceImpl implements ApplicationService {
  private ApplicationDao dao;
  @Autowired
  
  public ApplicationServiceImpl(ApplicationDao dao) {
	super();
	this.dao = dao;
}
  public List<Application> getapplications() {
		// TODO Auto-generated method stub
		return null;
	}

}
