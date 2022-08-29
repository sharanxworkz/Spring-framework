package com.xworkz.tv;

public class Tv {
	 private String name;
	 private double price;
	 private String brand;
	 private Display display;
		private Remote remote;
		private SetupBox box;
		private Stand stand;
	 
	 public Tv() {
		System.out.println(getClass().getSimpleName()+"Bean has been created");
	}

	@Override
	public String toString() {
		return "Tv [name=" + name + ", price=" + price + ", brand=" + brand + ", display=" + display + ", remote="
				+ remote + ", box=" + box + ", stand=" + stand + "]";
	}
	
	

	public Tv(String name, double price, String brand, Display display, Remote remote, SetupBox box, Stand stand) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.display = display;
		this.remote = remote;
		this.box = box;
		this.stand = stand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Remote getRemote() {
		return remote;
	}

	public void setRemote(Remote remote) {
		this.remote = remote;
	}

	public SetupBox getBox() {
		return box;
	}

	public void setBox(SetupBox box) {
		this.box = box;
	}

	public Stand getStand() {
		return stand;
	}

	public void setStand(Stand stand) {
		this.stand = stand;
	}
	 
	 
}
