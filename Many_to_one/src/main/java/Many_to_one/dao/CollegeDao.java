package Many_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Many_to_one.dto.Building;
import Many_to_one.dto.College;

public class CollegeDao 
{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("giri");
	EntityManager em;
	EntityTransaction et;
	
	public Building saveBuildingCollege(College college, Building building1, Building building2) 
	{
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
		em.persist(college);
		em.persist(building1);
		em.persist(building2);
		
		et.commit();
		return building2;
	
	}
}