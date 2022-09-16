package org.alvas.one_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.one_to_one.dto.Adhar;
import org.alvas.one_to_one.dto.Person;

public class PersonDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	EntityManager em;
	EntityTransaction et;

	public Person savePerson(Person pesron, Adhar adhar) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
		em.persist(adhar);
		em.persist(pesron);
		et.commit();
		return pesron;
	}

	public Person updatePerson(int id, String name, int adharnumber) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		Person person = em.find(Person.class, id);
		Integer id1 = person.getAdhar().getId();
		Adhar adhar = em.find(Adhar.class, person.getAdhar().getId());
		person.setName(name);
		adhar.setAdharnumber(adharnumber);
		if (person != null) {
			et.begin();
			em.merge(person);
			em.merge(adhar);
			et.commit();
			System.out.println("data Updated");
		} else {
			System.out.println("Data not updated");
		}
		return person;
	}

	public Person getPersonAdhar(int id) {
		em = emf.createEntityManager();
		Person person = em.find(Person.class, id);
		return person;
	}

	public Person DeleteById(int id) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		Person person = em.find(Person.class, id);
		Integer id1 = person.getAdhar().getId();
		Adhar adhar = em.find(Adhar.class, person.getAdhar().getId());
		et.begin();
		em.remove(person);
		em.remove(adhar);
		et.commit();
		return person;
	}

}
