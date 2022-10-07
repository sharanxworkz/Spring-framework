package com.xworkz.volleyball;

public class Air extends Object {
	String type;
	 
	public Air() {
		System.out.println("bean created");
	}
	@Override
	public String toString() {
		return "Air [type=" + type + "]";
	}
	public Air(String type) {
		
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	 
	 

}
