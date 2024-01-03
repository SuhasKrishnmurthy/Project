package com.cricket;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("suhas");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	IPL ipl2=manager.find(IPL.class,3);
	ipl2.setT_num(3);
	ipl2.setName("MI");
	ipl2.setCaptain("Rohith Sharma");
	ipl2.setPrice(750000);
	transaction.begin();
	manager.remove(ipl2);
	transaction.commit();
}
}
