package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.User;

public class TestUserSave {

	public static void main(String[] args) {

		User user = new User();
		user.setName("rajesh");
		user.setEmail("rajesh@gmail.com");
		user.setPhone(9550556999l);
		user.setPassword("rajesh3490");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

		System.out.println("data saved");
	}

}
