package com.resume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "rsg_project")
public class Project {
	@Id
	@Column(name="project_id")
	@TableGenerator(name = "rsg_gen", allocationSize = 1, initialValue = 1, table = "rsg_tbl_gen", valueColumnName = "value", pkColumnName = "id", pkColumnValue = "project_id")
	@GeneratedValue(generator="rsg_gen",strategy=GenerationType.TABLE)
	private int id;
	@Column(name = "title")
	private String title;
	@Column(name = "status")
	private String status;
	@Column(name = "descripton")
	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
