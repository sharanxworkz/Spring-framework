package com.xworkz.chair;

public class Chair {
	private String name;
	private int rollno;
	private Stand stand;

	public Chair(String name, int rollno, Stand stand) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.stand = stand;
	}

	@Override
	public String toString() {
		return "Chair [name=" + name + ", rollno=" + rollno + ", stand=" + stand + "]";
	}

}
