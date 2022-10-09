package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class FoodController {
	
private Collection<FoodDTO >foodDTOs=new ArrayList<FoodDTO>();
	
	public FoodController() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@RequestMapping("/food.do")
	public String foodAdd(FoodDTO foodDTO,Model model) {
		System.out.println("Calling foodAdd");
		System.out.println("Fecthing FoodDto"+foodDTO);
		model.addAttribute("FoodDto", foodDTO);
		boolean add = foodDTOs.add(foodDTO);
	    int size = foodDTOs.size();
	    model.addAttribute("count", size);
		System.out.println(add);
		return "Food.jsp";
		
	}
	@RequestMapping("/foodDisplay.do")
	public String viewFood(Model model) {
		System.out.println("Calling viewFood");
		model.addAttribute("list", this.foodDTOs);
		return "DisplayFood.jsp";
		
	}

}
