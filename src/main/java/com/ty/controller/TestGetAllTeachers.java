package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Teacher;

public class TestGetAllTeachers {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select t from Teacher t";
		Query query = entityManager.createQuery(jpql);

		List<Teacher> lt = query.getResultList();
		for (Teacher teacher : lt) {
			System.out.println("teacher id is " + teacher.getId());
			System.out.println("teacher name is " + teacher.getName());
			System.out.println("teacher email is " + teacher.getEmail());
			System.out.println("teacher phone is " + teacher.getPhone());
			System.out.println("-------------------------");
		}
	}

}
