package project1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {

public static void main(String[] args) {
// TODO Auto-generated method stub
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

User user =entityManager.find(User.class,102);
user.setName("meghaaaa");
entityTransaction.begin();
entityManager.merge(user);
entityTransaction.commit();
System.out.println("UserId="+user.getId()+ "updated susscessfully");


}

}
