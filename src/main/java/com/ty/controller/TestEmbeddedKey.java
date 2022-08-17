package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.AccountId;
import com.ty.dto.CartAccount;

public class TestEmbeddedKey {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		AccountId accountId = new AccountId();
		accountId.setEmail("Rajeshb@gmail.com");
		accountId.setPhone(9550556999l);
		CartAccount cartAccount = new CartAccount();
		cartAccount.setName("rajesh");
		cartAccount.setGender("male");
		cartAccount.setAccountId(accountId);
		cartAccount.setPassword("rajesh3490");

		entityTransaction.begin();
		entityManager.persist(cartAccount);
		entityTransaction.commit();
		
		System.out.println("data is inserted");
	}

}
