package com.xworkz.tv;

public class Display extends Object {
	private String type;

	public Display() {
		System.out.println(this.getClass().getSimpleName() + "display bean has bean created");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Display [type=" + type + "]";
	}

}
