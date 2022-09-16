package org.alvas.customer_crud_controller;

import java.util.Scanner;

import org.alvas.hibernate_customer_crud.dao.CustomerDao;
import org.alvas.hibernate_customer_crud.dto.Customer;

public class CustomerController 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Customer customer;
		CustomerDao customerDao = new CustomerDao();
		while(true)
		{
			System.out.println("1.Save Customer.\n2.Update.\n3.Delete id.\nEnter the choice:");
			int choice = sc.nextInt();
			switch(choice) 
			{
				case 1:
				{	
					customer = new Customer();
					System.out.println("Enter CustName:");
					customer.setName(sc.next());
					System.out.println("Enter CustEmail:");
					customer.setEmail(sc.next());
					customerDao.saveCustomer(customer);
					break;
				}
				
				case 2:
				{
					
					System.out.println("Enter :Id");
					int id = sc.nextInt();
					System.out.println("Enter Updated name:");
					String name = sc.next();
					customerDao.update(id,name);
					break;
				}
				
				case 3:
				{
					customer = new Customer();
					System.out.println("Enter :Id");
					int id = sc.nextInt();
					customerDao.delete(id);
					break;
				}
				case 4:
				{
					customer = new Customer();
					customerDao.Display();
					break;
				}
			}
		}
	}
}
