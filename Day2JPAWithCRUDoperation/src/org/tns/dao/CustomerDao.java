package org.tns.dao;

import org.tns.entities.Customer;

public interface CustomerDao {
	// abstract method for CRUD-operation
	// user-defined method
	void addCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomer(Customer customer);

	Customer getCustomerById(int cust_ID);

	void commitTransaction();

	void beginTransaction();

}
