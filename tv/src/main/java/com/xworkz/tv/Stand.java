package com.xworkz.tv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Stand extends Object {
	@Value("SONY STAND")
	private String type;

	public Stand() {
		System.out.println(this.getClass().getSimpleName() + "Stand bean has been created");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Stand [type=" + type + "]";
	}

}
