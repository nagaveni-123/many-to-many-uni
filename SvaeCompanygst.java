package com.ty.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SvaeCompanygst {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		Company c=new Company();
		Gst gst=new Gst();
		c.setName("Marish");
		c.setAddress("Bangalore");
		gst.setNumber("AeA123");
		gst.setStatus("Active");
		gst.setCompany(c);
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(c);
		em.persist(gst);
		et.commit();
		
	}

}
