package com.xworkz.tv;

public class Remote extends Object {

	private String type;

	public Remote() {
		System.out.println(this.getClass().getSimpleName() + "remote bean has been created");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Remote [type=" + type + "]";
	}

}
