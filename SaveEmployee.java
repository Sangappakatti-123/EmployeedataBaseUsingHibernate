package com.v;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.v.Employee;

public class SaveEmployee {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sangu");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Employee p1=new Employee();
	
	p1.setName("sangu");
	p1.setAge(28);
	p1.setDesignation("CEO");
	p1.setPhno(8088679937l);
	p1.setSal(950000.0);
	
	Employee p2=new Employee();
	
	p2.setName("muzaffar");
	p2.setAge(25);
	p2.setDesignation("manager");
	p2.setPhno(356562211l);
	p2.setSal(60000.0);
	
	Employee p3=new Employee();
	
	p3.setName("sumanth");
	p3.setAge(23);
	p3.setDesignation("developer");
	p3.setPhno(3565211l);
	p3.setSal(12000.0);
	
	Employee p4=new Employee();
	
	p4.setName("sanketh");
	p4.setAge(23);
	p4.setDesignation("designer");
	p4.setPhno(5252211l);
	p4.setSal(90000.0);
	
    Employee p5=new Employee();
	
	p5.setName("manjunath");
	p5.setAge(23);
	p5.setDesignation("assistant manager");
	p5.setPhno(95455356511l);
	p5.setSal(7000.0);
	
	entityTransaction.begin();
	entityManager.persist(p1);
	entityManager.persist(p2);
	entityManager.persist(p3);
	entityManager.persist(p4);
	entityManager.persist(p5);
	entityTransaction.commit();
	
	
	
}
}
