package hu.schonherz.training.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hu.schonherz.training.entity.Test;

public class CreateDBApp {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Test test = new Test();
		test.setTitle("First Test");

		entitymanager.persist(test);

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}