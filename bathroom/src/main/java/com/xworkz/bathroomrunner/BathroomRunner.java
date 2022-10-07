package com.xworkz.bathroomrunner;

import com.xworkz.bathroomdao.BathroomDAO;
import com.xworkz.bathroomdao.BathroomDAOImpl;
import com.xworkz.bathroomentity.BathroomEntity;

public class BathroomRunner {
	public static void main(String[] args) {
		BathroomEntity entity = new BathroomEntity(1, "btm", "male", "public", 500, 4, "sharan", "sharan", "nandya", "nandya");
		BathroomDAO dao = new BathroomDAOImpl();
		boolean save=dao.save(entity);
		System.out.println(save);
	}

}
