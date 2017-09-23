package com.k.farmFinal.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Production implements Serializable{
	
	private static final long serialVersionUID = -9221958570355849344L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_production;

	private Date productionDate;
	
	private Integer state;
	
	private Integer price;
	
	private Integer soldP;
		
	@ManyToOne
	private Animal animal;

	/*  ---------------Gets and Sets-----------------*/

	public Integer getId_production() {
		return id_production;
	}

	public void setId_production(Integer id_production) {
		this.id_production = id_production;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getSoldP() {
		return soldP;
	}

	public void setSoldP(Integer soldP) {
		this.soldP = soldP;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	
}
