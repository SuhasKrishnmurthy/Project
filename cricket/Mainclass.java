package com.cricket;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("suhas");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	IPL ipl=new IPL();
	ipl.setT_num(1);
	ipl.setName("RCB");
	ipl.setCaptain("Virat kohli");
	ipl.setPrice(500000);
	
	IPL ipl1=new IPL();
	ipl1.setT_num(2);
	ipl1.setName("CSK");
	ipl1.setCaptain("M S Dhoni");
	ipl1.setPrice(600000);
	
	IPL ipl2=new IPL();
	ipl2.setT_num(3);
	ipl2.setName("MI");
	ipl2.setCaptain("Rohith Sharma");
	ipl2.setPrice(500000);
	
	transaction.begin();
	manager.persist(ipl);
	manager.persist(ipl1);
	manager.persist(ipl2);
	transaction.commit();
}
}
