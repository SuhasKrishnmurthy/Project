package com.cricket;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetchall {
public static void main(String[] args) {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("suhas");
			EntityManager manager=factory.createEntityManager();
			EntityTransaction transaction=manager.getTransaction();
			List<IPL>a= manager.createQuery("Select s from IPL s").getResultList();
			for(IPL T:a)
			{
				System.out.println(T);
			}
		}

	}

