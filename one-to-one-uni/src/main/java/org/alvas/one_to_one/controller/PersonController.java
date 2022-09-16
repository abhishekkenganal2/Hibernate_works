package org.alvas.one_to_one.controller;

import java.util.Scanner;

import org.alvas.one_to_one.dao.PersonDao;
import org.alvas.one_to_one.dto.Adhar;
import org.alvas.one_to_one.dto.Person;

public class PersonController {
	static Person person = new Person();
	static Adhar adhar = new Adhar();
	static PersonDao dao = new PersonDao();

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.InsertpersonAndAdhar\n2.updatePerson\n3.getPersonAdhar\n4.Delete");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("Enter the Adhar Number");
				int adno = sc.nextInt();
				System.out.println("Enter the Adhar Addres");
				String ad = sc.next();
				System.out.println("Enter the Person Name");
				String name = sc.next();
				System.out.println("Enter the Email");
				String email = sc.next();
				adhar.setAdharnumber(adno);
				adhar.setAddress(ad);
				person.setName(name);
				person.setEmail(email);
				person.setAdhar(adhar);
				dao.savePerson(person, adhar);
			}
				break;
			case 2: {
				System.out.println("Enter the id to update");
				int id = sc.nextInt();
				System.out.println("Enter the name to update");
				String name = sc.next();
				System.out.println("Enter the Adhar Number to Update");
				int adno = sc.nextInt();
				dao.updatePerson(id, name, adno);
			}
				break;
			case 3: {
				System.out.println("Enter the id to diplay Details");
				int id = sc.nextInt();
				Person person = dao.getPersonAdhar(id);
				System.out.println("Person details");
				System.out.println(person.getId() + "\t" + person.getName() + "\t" + person.getName());
				System.out.println("Adhar details");
				System.out.println(person.getAdhar().getId());
				System.out.println(person.getAdhar().getAdharnumber());
				System.out.println(person.getAdhar().getAddress());

			}
				break;
			case 4: {
				System.out.println("Enter the id to delete");
				int id = sc.nextInt();
				dao.DeleteById(id);
			}
				break;
			default:
				System.out.println("Enter the currect choice");
				break;
			}

		}
	}

}
