package com.advantio.carry.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
//@DynamicUpdate
@Table(name = "adverts")

public class Advert {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NotNull
	private String title;

	@NotNull
	private String fuel;

	@NotNull
	private Integer price;

	@NotNull
	private Boolean newIs;

	private Integer mileage;

	@Column(columnDefinition = "DATE")
	private LocalDate firstRegistration;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Boolean getnewIs() {
		return newIs;
	}

	public void setnewIs(Boolean newIs) {
		this.newIs = newIs;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	public LocalDate getFirstRegistration() {
		return firstRegistration;
	}

	public void setFirstRegistration(LocalDate firstRegistration) {
		this.firstRegistration = firstRegistration;
	}

	public Advert(Integer id, @NotNull String title, @NotNull String fuel, @NotNull Integer price,
			@NotNull Boolean newIs, Integer mileage, LocalDate firstRegistration) {
		super();
		this.id = id;
		this.title = title;
		this.fuel = fuel;
		this.price = price;
		this.newIs = newIs;
		this.mileage = mileage;
		this.firstRegistration = firstRegistration;
	}

	public Advert() {
		super();
	}


}
