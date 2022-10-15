package com.xworkz.encapsulation;

public class AccountSbi {
	
	private int id;
	private String name,branch,manager,location;
	
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id=i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "AccountSbi [id=" + id + ", name=" + name + ", branch=" + branch + ", manager=" + manager + ", location="
				+ location + "]";
	}
	/*public AccountSbi(int id, String name, String branch, String manager, String location) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.manager = manager;
		this.location = location;
}	*/
	

}
