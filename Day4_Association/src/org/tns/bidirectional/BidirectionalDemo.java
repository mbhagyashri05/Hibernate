package org.tns.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//create a dept1;
		
		Department department=new Department();
		department.setId(16121);
		department.setName("HR");
		
		//create a dept2;
		
		Department department1=new Department();
		department1.setId(17122);
		department1.setName("Marketing");
		
		//create an emp1;
		Employee emp=new Employee();
		emp.setEmp_id(163);
		emp.setEmp_name("Piyush Mattoo");
		emp.setSalary(50500);
		
		//create an emp1;
		Employee emp1=new Employee();
		emp1.setEmp_id(193);
		emp1.setEmp_name("Bhagyashri Marathe");
		emp1.setSalary(32500);
		
		emp.setDepartment(department);
		em.persist(emp);
		
		
		emp1.setDepartment(department1);
		em.persist(emp1);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();

		
						

	}

}
