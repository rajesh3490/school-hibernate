package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.User;

public class TestGetUserByEmailAndPassword {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select u from User u where u.email=?1 and u.password=?2";

		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, "rajesh@gmail.com");
		query.setParameter(2, "rajesh3490");

		List<User> ls = query.getResultList();
		
		for (User user : ls) {
			System.out.println("user id is " + user.getId());
			System.out.println("user name is " + user.getName());
			System.out.println("user email is " + user.getEmail());
			System.out.println("user password is " + user.getPassword());
			System.out.println("user phone is " + user.getPhone());
			System.out.println("---------------------------");
		}

	}

}
