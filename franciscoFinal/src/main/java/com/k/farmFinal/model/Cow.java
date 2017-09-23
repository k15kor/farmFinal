package com.k.farmFinal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Cow extends Animal{

	private static final long serialVersionUID = 7064225308609982726L;

	private Date bornDate;
	
	/*  ---------------Gets and Sets-----------------*/

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}

