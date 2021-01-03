package org.hcl.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hcl.model.Customer;
import org.hcl.services.CustomerService;
import org.hcl.services.CustomerServiceImpl;


public class CustomerController extends HttpServlet {
private static final long serialVersionUID = 1L;

CustomerService service=new CustomerServiceImpl();
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter pw=response.getWriter();
List<Customer> customers=service.getCustomers();
System.out.println(customers);
request.setAttribute("customers", customers);
RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
rd.forward(request, response);
}

}