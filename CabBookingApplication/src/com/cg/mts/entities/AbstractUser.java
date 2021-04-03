package com.cg.mts.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public abstract class AbstractUser {
	private String username;
	private String password;
	private String mobileNumber;
	private String email;


}