package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Student;


public class TestGetAllStudents {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		String jpql= "select s from Student s";
		Query query=entityManager.createQuery(jpql);
		
		List<Student> ls=query.getResultList();
		
		for (Student student : ls) {
			
			System.out.println("student id is "+student.getId());
			System.out.println("student name is "+student.getName());
			System.out.println("student age is "+student.getAge());
			System.out.println("-----------------");
		}
	}

}
