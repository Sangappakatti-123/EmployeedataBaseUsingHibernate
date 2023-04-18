package com.v;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Getdessal {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sangu");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Query query= entityManager.createQuery("select s from Employee s where s.designation=?1 or s.sal>=?2");
	query.setParameter(1, "CEO");
	query.setParameter(2, 40000.0);
	
	List<Employee> employees=query.getResultList();
	
	for(Employee e:employees) {
		System.out.println("Employee id:"+e.getId());
		System.out.println("Employee name :"+e.getName());
		System.out.println("Employee age :"+e.getAge());
		System.out.println("Employee phno :"+e.getPhno());
		System.out.println("Employee designation :"+e.getDesignation());
		System.out.println("Employee salary :$"+e.getSal());
		System.out.println("________________________________________________");
		
	}
}
}
