package com.v;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Maxsal {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sangu");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Query query= entityManager.createQuery("select s from Employee s");
	
	
	List<Employee> employees=query.getResultList();
	Employee maxemp=employees.get(0);
	double max=employees.get(0).getSal();
	
	for(Employee e:employees) {
		
		if(e.getSal()>max) {
			max=e.getSal();
			maxemp=e;
		}
	}
	
		System.out.println("Employee id:"+maxemp.getId());
		System.out.println("Employee name :"+maxemp.getName());
		System.out.println("Employee age :"+maxemp.getAge());
		System.out.println("Employee phno :"+maxemp.getPhno());
		System.out.println("Employee designation :"+maxemp.getDesignation());
		System.out.println("Employee salary :$"+maxemp.getSal());
		System.out.println("________________________________________________");
		
	}
}

