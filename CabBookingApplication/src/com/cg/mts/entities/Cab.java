package com.cg.mts.entities;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cab {
	private int cabId;
	private String carType;
	private float perKmRate;

}
