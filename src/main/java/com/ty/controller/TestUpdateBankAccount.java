package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.BankAccount;

public class TestUpdateBankAccount {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		BankAccount bankAccount = entityManager.find(BankAccount.class, 1);

		if (bankAccount != null) {
			bankAccount.setName("reddy");
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.merge(bankAccount);
			entityTransaction.commit();
		}
		else {
			System.out.println("no account found");
		}

	}

}
