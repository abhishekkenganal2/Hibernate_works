package project1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserDisplayController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		String query = "Select u from user u";
		Query query2 = entityManager.createQuery(query);
		
		List<User> list = query2.getResultList();
		list.forEach(a->System.out.println(a.getId()+"\n"+a.getName()+"\n"+a.getEmail()+"\n"));
	}

}
