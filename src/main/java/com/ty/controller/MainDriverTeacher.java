package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Teacher;

public class MainDriverTeacher {

	public static void main(String[] args) {

		Teacher teacher=new Teacher();
		teacher.setId(1);
		teacher.setName("ram");
		teacher.setEmail("ram@gamil.com");
		teacher.setPhone(95500556990l);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		System.out.println("data inserted");
	}

}
