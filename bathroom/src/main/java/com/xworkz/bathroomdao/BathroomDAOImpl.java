package com.xworkz.bathroomdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.bathroomentity.BathroomEntity;
import com.xworkz.bathroom.util.Factory;

public class BathroomDAOImpl implements BathroomDAO{
	EntityManagerFactory factory = Factory.getFactory();

	public boolean save(BathroomEntity entity) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();

			manager.persist(entity);

			transaction.commit();
			
			
		}
		catch(PersistenceException exception) {
			exception.printStackTrace();
		}
		finally {
			manager.close();
		}
		
		return false;
	}

}
