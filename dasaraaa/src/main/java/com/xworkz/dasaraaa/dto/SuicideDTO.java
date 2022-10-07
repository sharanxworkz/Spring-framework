package com.xworkz.dasaraaa.dto;

public class SuicideDTO {
	private String name;
	private Integer age;
	private String reason;
	private String gender;
	private Integer noOfAttempts;
	private String spot;
	private String dateAndTime;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getNoOfAttempts() {
		return noOfAttempts;
	}
	public void setNoOfAttempts(Integer noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}
	public String getSpot() {
		return spot;
	}
	public void setSpot(String spot) {
		this.spot = spot;
	}
	public String getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "SuicideDTO [name=" + name + ", age=" + age + ", reason=" + reason + ", gender=" + gender
				+ ", noOfAttempts=" + noOfAttempts + ", spot=" + spot + ", dateAndTime=" + dateAndTime + ", type="
				+ type + "]";
	}
	
	
	
	

}
