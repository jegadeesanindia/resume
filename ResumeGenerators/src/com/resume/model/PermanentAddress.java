package com.resume.model;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.resume.model.Address;

@Entity
@DiscriminatorValue("permanent")
public class PermanentAddress extends Address{
	@Column(name="Zipcode")
	private int zipcode;

	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
