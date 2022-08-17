package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.BankAccount;

public class TestSaveBankAccount {

	public static void main(String[] args) {

		BankAccount bankAccount=new BankAccount();
		
		bankAccount.setName("rajesh");
		bankAccount.setAddress("raj");
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(bankAccount);
		entityTransaction.commit();
		
		
	}

}
