package com.xworkz.lambda.constant;

public enum OwningType {
	RENT("rent"),LEASE("lease"),OWN("own");

	
	private String value;
	
private OwningType(String value) {
	this.value=value;
}
	
	public String getValue() {
		return value;
	}

}
