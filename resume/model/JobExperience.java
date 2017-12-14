package com.resume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rsg_jobexperience")
public class JobExperience {

	@Id
	@Column(name = "R_ID")
	@GeneratedValue(generator = "rsg_gen", strategy = GenerationType.TABLE)
	private int ID;

	@Column(name = "name_of_job")
	private String nameOfJob;
	@Column(name = "job")
	private String job;
	@Column(name = "experience")
	private String experience;

	public String getNameOfJob() {
		return nameOfJob;
	}

	public void setNameofjob(String nameofjob) {
		this.nameOfJob = nameofjob;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

}
