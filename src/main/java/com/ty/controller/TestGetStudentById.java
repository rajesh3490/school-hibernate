package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Student;

public class TestGetStudentById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student student=entityManager.find(Student.class, 3);
		if(student!=null)
		{
			System.out.println("student id is "+student.getId());
			System.out.println("student name is "+student.getName());
			System.out.println("student age is "+student.getAge());
		}
		else
		{
			System.out.println("there is no student with such id");
		}
	}

}
