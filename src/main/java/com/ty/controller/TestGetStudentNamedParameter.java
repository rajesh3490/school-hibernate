package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Student;

public class TestGetStudentNamedParameter {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select s from Student s where s.age> :myage";

		Query query = entityManager.createQuery(jpql);

		query.setParameter("myage", 20);
		List<Student> ls = query.getResultList();
		if (ls.size() != 0) {
			for (Student student : ls) {

				System.out.println("student id is " + student.getId());
				System.out.println("student name is " + student.getName());
				System.out.println("student age is " + student.getAge());
				System.out.println("-----------------");
			}
		} else {
			System.out.println("no records found");
		}

	}

}
