package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Teacher;

public class TestGetTeacherById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Teacher teacher = entityManager.find(Teacher.class, 3);

		if (teacher != null) {
			System.out.println("teacher id is " + teacher.getId());
			System.out.println("teacher name is " + teacher.getName());
			System.out.println("teacher email is " + teacher.getEmail());
			System.out.println("teacher phone is " + teacher.getPhone());
		} else {
			System.out.println("there is no teacher with such id");
		}

	}

}
