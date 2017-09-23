package com.k.farmFinal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Animal implements Serializable{

	private static final long serialVersionUID = 4834635923698354928L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	
	@Column(nullable = false) //esto es para que no sea nulo
	private Date buyDate; //fecha de compra
	
	private Integer buyP; //PVP compra
	
	@ManyToOne
	private User user;
	
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "animal")
	private List<Production> production;

	/*  ---------------Gets and Sets-----------------*/

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getBuyDate() {
		return buyDate;
	}


	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}


	public Integer getBuyP() {
		return buyP;
	}


	public void setBuyP(Integer buyP) {
		this.buyP = buyP;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public List<Production> getProduction() {
		return production;
	}


	public void setProduction(List<Production> production) {
		this.production = production;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
