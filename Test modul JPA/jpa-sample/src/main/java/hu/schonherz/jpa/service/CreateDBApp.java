package hu.schonherz.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateDBApp {
   public static void main( String[ ] args ) {
   
   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Test" );
   EntityManager entitymanager = emfactory.createEntityManager( );
   entitymanager.getTransaction( ).begin( );

   


   entitymanager.getTransaction().commit();
   entitymanager.close();
   emfactory.close();
   }
}