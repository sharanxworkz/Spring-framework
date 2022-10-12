package com.xworkz.milkshop.servicee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.milkshop.daoo.MilkShopDAO;
import com.xworkz.milkshop.dto.MilkShopDTO;
@Service
public class MilkShopServiceImpl implements MilkShopService {
	
	@Autowired
private MilkShopDAO milkShopDAO;
	
	@Override
	public boolean validateAndSave(MilkShopDTO dto) {
		System.out.println("created"+this.getClass().getSimpleName());
		String string = milkShopDAO.toString();
		System.out.println(string);
		return true;
		
		
	}

}
