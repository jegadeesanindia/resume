package com.resume.model;

import javax.persistence.*;

@Entity
@Table(name = "rsg_address")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@PrimaryKeyJoinColumn(name = "R_ID")
@DiscriminatorValue(value = "Address")
public class Address extends Basicprofile {
	
	@Id
	@Column(name = "R_ID")
	@GeneratedValue(generator = "rsg_gen", strategy = GenerationType.TABLE)
	private int ID;
	
	@Column(name = "door_no")
	private String doorNo;
	@Column(name = "name")
	private String name;
	@Column(name = "village")
	private String village;
	@Column(name = "taluk")
	private String taluk;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getTaluk() {
		return taluk;
	}

	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

}
