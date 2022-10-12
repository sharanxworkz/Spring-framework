package com.xworkz.milkshop.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter

@AllArgsConstructor
@ToString

public class MilkShopDTO {
	
	private Integer id;
	private String name;
	private String brand;
	private String owner;
	private String ambassador;
	
	
	public MilkShopDTO() {
		System.out.println("MilkShopDTO"+this.getClass().getSimpleName());
	}
	
	

}

