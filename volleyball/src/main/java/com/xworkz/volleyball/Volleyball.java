package com.xworkz.volleyball;

public class Volleyball {
	String name;
	int price;
	boolean isAirFilled;
	
	public Volleyball() {
		System.out.println(this.getClass().getSimpleName()+ " "+ "bean has been created");
	}




	@Override
	public String toString() {
		return "Volleyball [name=" + name + ", price=" + price + ", isAirFilled=" + isAirFilled + "]";
	}
	public Volleyball(String name, int price, boolean isAirFilled) {
		
		this.name = name;
		this.price = price;
		this.isAirFilled = isAirFilled;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
	


	
	
	

}
