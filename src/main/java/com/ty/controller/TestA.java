package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Student;

public class TestA {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(2);
		student.setName("lokesh");
		student.setAge(24);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.persist(student);

		entityTransaction.commit();
		System.out.println("data inserted");

	}

}
