package com.ty.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetCompanyGST {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Gst gst = entityManager.find(Gst.class, 1);
		if (gst != null) {
			System.out.println("-------------------GST info------------------------");
			System.out.println("" + gst.getId());
			System.out.println(" " + gst.getNumber());
			System.out.println(" " + gst.getStatus());

			Company company=gst.getCompany();
			if (company != null) {
				System.out.println("-------------------Company"
						+ ""
						+ ""
						+ ""
						+ ""
						+ ""
						+ ""
						+ " info------------------------");
				System.out.println(company.getId());
				System.out.println(company.getAddress());
				System.out.println(company.getName());
			}
		}

	}
}

