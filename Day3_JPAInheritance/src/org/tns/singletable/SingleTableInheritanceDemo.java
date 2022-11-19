package org.tns.singletable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//Create an emp1
		Employee e=new Employee();
		e.setEmpID(11);
		e.setName("Komal");
		e.setSalary(67000.80);
		em.persist(e);
		
		//Create an emp2
		Employee e1=new Employee();
		e1.setEmpID(12);
		e1.setName("Rajat");
		e1.setSalary(47000.80);
		em.persist(e1);
		
		//create a manager
		Manager m=new Manager();
		m.setEmpID(13);
		m.setName("Priyanka");
		m.setSalary(100000.00);
		m.setDeptname("HR");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("Employee data is added");
		em.close();
		f.close();
		
		
		

		
		
		
	}

}