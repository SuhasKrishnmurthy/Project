package com.cricket;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {
		public static void main(String[] args) {
			 EntityManagerFactory factoyr=Persistence.createEntityManagerFactory("suhas");
			 EntityManager manager=factoyr.createEntityManager();
			 EntityTransaction transaction=manager.getTransaction();
			IPL ipl=manager.find(IPL.class,1);
			 System.out.println(ipl);
	}
	
}
