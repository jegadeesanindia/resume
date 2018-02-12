package com.resume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "rsg_academic")
public class Academic {
	

	@Id
	@Column(name = "academic_id")
	@TableGenerator(name = "rsg_gen", allocationSize = 1, initialValue = 1, table = "rsg_tbl_gen", valueColumnName = "value", pkColumnName = "id", pkColumnValue = "academic_id")
	@GeneratedValue(generator="rsg_gen",strategy = GenerationType.TABLE)
	private int ID;
	
	@Column(name = "COURSES")
	private String courses;
	@Column(name = "INSTITUTION")
	private String institution;
	@Column(name = "GRADUATE_YEAR")
	private String graduateyear;
	@Column(name = "PERCENTAGE")
	private String percentage;

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getGraduateyear() {
		return graduateyear;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setGraduateyear(String graduateyear) {
		this.graduateyear = graduateyear;
	}


}
