package com.xworkz.milkshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.milkshop.dto.MilkShopDTO;
import com.xworkz.milkshop.servicee.MilkShopService;

@Component
@RequestMapping("/milk")

public class MilkShopController {

	@Autowired
	private MilkShopService milkShopService;

	public MilkShopController() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String save(MilkShopDTO dto) {
	System.out.println(dto);
		System.out.println("calling save method");
		boolean save = milkShopService.validateAndSave(dto);
		if(save) {
			System.out.println("data sent to service" + save);
			return "Display";
		}

		else {
			System.out.println("Data is not valid and not save");
		}
		return "index";
	}

}
