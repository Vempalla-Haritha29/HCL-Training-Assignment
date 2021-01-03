package org.hcl.services;

import java.util.List;


import org.hcl.dao.CustomerDao;
import org.hcl.dao.CustomerDaoImpl;
import org.hcl.model.Customer;

public class CustomerServiceImpl implements CustomerService {
CustomerDao dao=new CustomerDaoImpl();
public List<Customer> getCustomers() {
return dao.getCustomers();
}

}