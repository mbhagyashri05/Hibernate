package org.tns.client;

import java.util.Scanner;

import org.tns.entities.Customer;
import org.tns.services.CustomerService;
import org.tns.services.CustomerServiceImpl;

public class Client {

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		Customer customer = new Customer();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		//create 
		customer.setName("Piyush Mattoo");
		customer.setProduct_price(69.69);
		service.addCustomer(customer);
		System.out.println("Customer added Successfully");

		// retreive
		customer=service.getCustomerById(1);
		System.out.println("Customer ID: "+customer.getCust_ID());
		System.out.println("Customer Name: "+customer.getName());
		System.out.println("Customer Product-price: "+customer.getProduct_price());

		//updation
		System.out.println("Enter the CustID for the updation");
		customer = service.getCustomerById(s.nextInt());
		customer.setName("Bhagyashri M");
		service.updateCustomer(customer);
		System.out.println("Customer updated Successfully");

		//deletion
		System.out.println("Enter the CustID for the deletion");
		customer=service.getCustomerById(s.nextInt());
		service.deleteCustomer(customer);
		System.out.println("Customer deleted Successfully");
	}

}
