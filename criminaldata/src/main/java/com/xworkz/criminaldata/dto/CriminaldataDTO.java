package com.xworkz.criminaldata.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="criminal_info")
public class CriminaldataDTO {
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	private Integer id;
	private String name;
	private Integer age;
	private String country;
	private String criminalType;
	private Integer noOfCases;
	private String alive;
	private String gender;
	private String international;
	private String married;
	private Integer jailTerm;
	private String wifeName;
	private String rightHandName;
	private String leftHandName;
	private String prisonName;
	private String netWorth;
	
	

}
