package project1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;



public class UserGetByName {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		String query = "Select u from User u where u.name=?1";
		Query query2 = entityManager.createQuery(query); 
		
		query2.setParameter(1, "Abdul");
		List<User> list= query2.getResultList();
		
		list.forEach(a->System.out.println(a.getId()+"\n"+a.getName()+"\n"+a.getEmail()+"\n"));
	}
}
