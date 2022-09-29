package com.ty.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersoncodebyId {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class, 1);
		if (person != null) {
			System.out.println("-------------------Person info------------------------");
			System.out.println("" + person.getName());
			System.out.println(" " + person.getId());
			System.out.println(" " + person.getGender());

			Pan pan = person.getPan();
			if (pan != null) {
				System.out.println("-------------------Pan info------------------------");
				System.out.println(pan.getId());
				System.out.println(pan.getNumber());
				System.out.println(pan.getType());
			}
		}

	}
}
