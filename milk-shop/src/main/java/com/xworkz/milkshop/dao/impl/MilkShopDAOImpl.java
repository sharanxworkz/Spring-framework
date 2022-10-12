package com.xworkz.milkshop.dao.impl;

import org.springframework.stereotype.Repository;

import com.xworkz.milkshop.daoo.MilkShopDAO;
import com.xworkz.milkshop.dto.MilkShopDTO;
@Repository
public class MilkShopDAOImpl implements MilkShopDAO {
	
	
	public MilkShopDAOImpl() {
System.out.println("created"+this.getClass().getSimpleName());	}

	@Override
	public boolean save(MilkShopDTO dto) {
		System.out.println("DAO IMPL created"+this.getClass().getSimpleName());
		return true;
	}

}
