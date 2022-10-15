package com.xworkz.criminaldata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.criminaldata.dto.CriminaldataDTO;
import com.xworkz.criminaldata.service.CriminalDataService;
@Controller
@RequestMapping("/criminal")
public class CriminalController {
	
	@Autowired
	private CriminalDataService criminalDataService;

	public CriminalController() {
		System.out.println("created CriminalController");
	}

	@PostMapping
	public String save(CriminaldataDTO criminaldataDTO) {
		System.out.println("calling save method");
		System.out.println("criminalDTO" + criminaldataDTO);
		boolean saveAndValidate = criminalDataService.saveAndValidate(criminaldataDTO);
System.out.println(saveAndValidate);

if(saveAndValidate) {
	System.out.println("data is saved");
	return "Display";
}
else {
	System.out.println("data is not saved");
}
		return "index";
		
		

	}

}
