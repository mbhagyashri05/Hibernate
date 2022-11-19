package org.tns.services;

import org.tns.entities.Customer;

public interface CustomerService {
	void addCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomer(Customer customer);

	Customer getCustomerById(int cust_ID);
}
