package com.xworkz.criminaldata.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.criminaldata.dto.CriminaldataDTO;

@Repository
public class CriminalDAOImpl implements CriminalDAO {
	
	@Autowired
	private EntityManagerFactory factory;
	
	EntityManager manager=null;
	
	public CriminalDAOImpl() {
		System.out.println("created CriminalDAOImpl");
	}
	
	
	@Override
	public boolean save(CriminaldataDTO criminalDTO) {
		try {
			manager=factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(criminalDTO);
			transaction.commit();
		}
		
		catch(PersistenceException e){
			e.printStackTrace();
			
			
		}
		finally {
			manager.close();
			
		}
		return true;
	}

}
