package com.cricket;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("suhas");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	IPL ipl2=manager.find(IPL.class,3);
	ipl2.setPrice(750000);
	transaction.begin();
	manager.merge(ipl2);
	transaction.commit();
}
}
