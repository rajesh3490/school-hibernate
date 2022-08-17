package com.ty.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Staff;

public class TestSaveStaff {

	public static void main(String[] args) {

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse("21-02-1997 12:22", dateTimeFormatter);

		Staff staff = new Staff();
		staff.setName("ram");
		//LocalDateTime.of(0, 0, 0, 0, 0, 0)
		staff.setDoj(dateTime);

		//LocalTime.of(0, 0)
		LocalTime localTime = LocalTime.parse("12:33");
		staff.setBirthTime(localTime);

		//LocalDate.of(0, null, 0)
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate birthDate = LocalDate.parse("21-02-1997", dateTimeFormatter1);
		staff.setBirthDate(birthDate);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(staff);
		entityTransaction.commit();

	}

}
