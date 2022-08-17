package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Staff;

public class TestGetAllStaff {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select s from Staff s";

		Query query = entityManager.createQuery(jpql);
		List<Staff> ls = query.getResultList();

		for (Staff staff : ls) {
			System.out.println("staff id is " + staff.getId());
			System.out.println("staff name is " + staff.getName());
			System.out.println("staff doj is " + staff.getDoj());
			System.out.println("staff date of birth is " + staff.getBirthDate());
			System.out.println("staff time of birth is " + staff.getBirthTime());
			System.out.println("---------------------------");
		}
	}

}
