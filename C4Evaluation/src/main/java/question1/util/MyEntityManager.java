package question1.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntityManager {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("C4Evaluation");
	
	public static EntityManager connectEntityManager() {
		return emf.createEntityManager();
	}
}
