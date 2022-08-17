package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Teacher;

public class TestUpdateTeacher {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("arjun ");
		teacher.setEmail("arjun@gmail.com");
		teacher.setPhone(9550556990l);

		entityTransaction.begin();
		entityManager.merge(teacher);
		entityTransaction.commit();
		System.out.println("data is updated");
	}

}
