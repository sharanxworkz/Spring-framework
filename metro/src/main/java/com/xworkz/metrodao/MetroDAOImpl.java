package com.xworkz.metrodao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.metro.util.Factory;
import com.xworkz.metroentity.MetroEntity;

public class MetroDAOImpl implements MetroDAO {
	EntityManagerFactory factory = Factory.getFactory();

	public boolean create(MetroEntity entity) {
		EntityManager manager = null;

		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();

			manager.persist(entity);

			transaction.commit();
		}

		catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			manager.close();

		}
		return false;
	}

}
