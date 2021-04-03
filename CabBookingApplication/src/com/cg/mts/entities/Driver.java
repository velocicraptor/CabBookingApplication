package com.cg.mts.entities;
import javax.persistence.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Driver extends AbstractUser {
	private int driverId;
	private String licenseNo;
	private Cab cab;
	private float rating;
	
	
}