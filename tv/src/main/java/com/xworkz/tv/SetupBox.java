package com.xworkz.tv;

import org.springframework.stereotype.Component;

@Component
public class SetupBox extends Object {
	private String type;

	public SetupBox() {
		System.out.println(this.getClass().getSimpleName() + "setupbox bean has been created");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "SetupBox [type=" + type + "]";
	}

}
