package com.cg.mts.util;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
public class JpaUtil {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	
	static {
		factory = Persistence.createEntityManagerFactory("cab_booking_application");

	}
	public static EntityManager getEntityManager() {
		if(manager==null || !manager.isOpen()) {
			manager = factory.createEntityManager();
		}
		return manager;
	}
protected JpaUtil() {
	super();
}
}
