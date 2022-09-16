package org.alvas.hibernate_customer_crud.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.alvas.hibernate_customer_crud.dto.Customer;

import java.util.List;

public class CustomerDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager;
	EntityTransaction entityTransaction;
	
	public Customer saveCustomer(Customer customer)
	{
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		if(customer!=null)
		{
			entityTransaction.begin();
			entityManager.persist(customer);
			entityTransaction.commit();
			System.out.println("....Data stored....");
		}else {
			System.out.println("...please set data...");
		}
		return customer;
	}
	
	public Customer update(int id,String name)
	{
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Customer customer2 = entityManager.find(Customer.class, id);
		customer2.setName(name);
		if(customer2 != null)
		{
			entityTransaction.begin();
			entityManager.merge(customer2);
			entityTransaction.commit();
			System.out.println("....Data Updated....");
		}else
		{
			System.out.println("....Please set Data....");
		}
		return customer2;
	}
	
	public Customer delete(int id)
	{
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Customer customer2 = entityManager.find(Customer.class, id);
		if(customer2 != null)
		{
			entityTransaction.begin();
			entityManager.remove(customer2);
			entityTransaction.commit();
			System.out.println("....Data Updated....");
		}else
		{
			System.out.println("....Please set Data....");
		}
		return customer2;
		
	}
	
	public void Display()
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		String query = "Select u from Customer u";
		Query query2 = entityManager.createQuery(query);
		
		List<Customer> list = query2.getResultList();
		list.forEach(a->System.out.println(a.getId()+"\n"+a.getName()+"\n"+a.getEmail()+"\n"));

	}
	
}
