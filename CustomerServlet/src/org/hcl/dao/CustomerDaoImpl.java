package org.hcl.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hcl.model.DataSource;
import org.hcl.model.Customer;
import org.hcl.util.DbUtil;

public class CustomerDaoImpl implements CustomerDao {
DataSource dataSource=DbUtil.getDataSource();
@Override
public List<Customer> getCustomers() {
Connection con=null;
Statement st=null;
ResultSet rs=null;
List<Customer> Customers=new ArrayList<>();
try {
con=DbUtil.getConnection(dataSource.getDriver(),
dataSource.getUrl(), dataSource.getUsername(), dataSource.getPassword());
if(con!=null)
{
st=con.createStatement();
rs=st.executeQuery("select * from Customer");
while(rs.next())
{
Customers.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3)));
}
}
} catch (Exception e) {
e.printStackTrace();
}
return Customers;
}

}