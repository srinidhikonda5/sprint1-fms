package com.capg1.lab_book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("CapgStudent");
    	EntityManager em =factory.createEntityManager();
    	EntityTransaction tx=em.getTransaction();
    	
     	Author a1 =new Author(1,"sri","nidhi","konda",1234123412l);
    	Author a2 =new Author(2,"sak","shi","kapukar",5677623412l);
    	Author a3 =new Author(3,"sravan","kumar","kittu",6789546543l);
    	Author a4 =new Author(4,"charan","kumar","chintu",6545678765l);
    	Author a5 =new Author(5,"cherry","berry","curry",1234123412l);
     	
     	
   	    tx.begin();   
    	em.persist(a1);
    	em.persist(a2);
    	em.persist(a3);
    	em.persist(a4);
    	em.persist(a5);
     	tx.commit();           
        System.out.println("data inserted");
    	
       
	em.remove(a1);
	tx.commit();
	System.out.println("deleted");
	
	
   a1.setAuthorId(25);
	tx.commit();
   System.out.println("updated");
   
   Author newAuthor =new Author(6, "nikki","chikki","chinni",1342345213l);
	 em.persist(newAuthor);
	 tx.commit();
	 System.out.println("added");

    }
}
