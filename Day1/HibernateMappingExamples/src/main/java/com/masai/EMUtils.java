package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtils {
	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("EmployeeHasA");
	}
	
	public static EntityManager provideEntityManager() {
		EntityManager em = emf.createEntityManager();
		return em;
	}
}
