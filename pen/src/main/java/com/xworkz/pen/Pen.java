package com.xworkz.pen;

public class Pen {
	private String name;
	private int price;
	private Refil refil;
	
	public Pen(String name, int price, Refil refil) {
		super();
		this.name = name;
		this.price = price;
		this.refil = refil;
	}

	@Override
	public String toString() {
		return "Pen [name=" + name + ", price=" + price + ", refil=" + refil + "]";
	}
	

}
