package assignment1.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntityManager {
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("SpringAssignment2");
	public static EntityManager provideEntityManager() {
    	return emf.createEntityManager();
    }
}
