package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Student;

public class TestUpdateStudent {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		Student student=entityManager.find(Student.class, 1);
//		student.setName("rajesh reddy");
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student student = new Student();
		student.setId(1);
		student.setName("reddy");
		student.setAge(26);

		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		System.out.println("data is updated");
	}

}
