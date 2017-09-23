package com.k.farmFinal.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Chicken extends Animal{

	//PREGUNTAR private static final long serialVersionUID 
	private static final long serialVersionUID = 142021653795306813L;
	
	private String type;//kind of chicken

	private String frecuency;//frecuency of eggs
	
	/*  ---------------Gets and Sets-----------------*/

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFrecuency() {
		return frecuency;
	}

	public void setFrecuency(String frecuency) {
		this.frecuency = frecuency;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
