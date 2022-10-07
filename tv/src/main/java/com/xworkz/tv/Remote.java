package com.xworkz.tv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Remote extends Object {

	@Value("SONY REMOTE")
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
