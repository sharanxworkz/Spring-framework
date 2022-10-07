package com.xworkz.metroentity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name="metro_info")
public class MetroEntity {
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	private String name;
	private String location;
	private int  noofstop;
	private String createdby;
	private LocalDate createddate;
	private  String updatedby;
	private LocalDate updateddate;
	private  LocalDateTime createdtime;
	private   LocalDateTime updatedtime;
	
	
	




	public MetroEntity( String name, String location, int noofstop, String createdby, LocalDate createddate,
			String updatedby, LocalDate updateddate, LocalDateTime createdtime, LocalDateTime updatedtime) {
		
	
		this.name = name;
		this.location = location;
		this.noofstop = noofstop;
		this.createdby = createdby;
		this.createddate = createddate;
		this.updatedby = updatedby;
		this.updateddate = updateddate;
		this.createdtime = createdtime;
		this.updatedtime = updatedtime;
	}
	
	
	
	
	
	
	

}
