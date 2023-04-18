package com.v;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpadateEmployee {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sangu");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Employee e1=entityManager.find(Employee.class, 5);
	e1.setDesignation("director");
	e1.setSal(2633000.00);
	
	if(e1!=null) {
		entityTransaction.begin();
		entityManager.merge(e1);
		entityTransaction.commit();
		
	}
}
}
