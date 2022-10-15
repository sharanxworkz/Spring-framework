package com.xworkz;

public class Vehicle {
	public int id;
	public String name;
	public Bike bike;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", bike=" + bike + "]";
	}
	



}
