package com.xworkz.bathroomentity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Data
@Getter
@Setter
@ToString
@Table(name="bathroom_info")
public class BathroomEntity {
	@Id
	private int id;
	private String location;
	private String gender;
	private String  type;
	private int cost;
	private int duration;
	private String  createdby;
	private String  updatedby; 
	private String  createddate;
	private String updateddate;
	
	
	public BathroomEntity(int id, String location, String gender, String type, int cost, int duration, String createdby,
			String updatedby, String createddate, String updateddate) {
		
		this.id = id;
		this.location = location;
		this.gender = gender;
		this.type = type;
		this.cost = cost;
		this.duration = duration;
		this.createdby = createdby;
		this.updatedby = updatedby;
		this.createddate = createddate;
		this.updateddate = updateddate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
