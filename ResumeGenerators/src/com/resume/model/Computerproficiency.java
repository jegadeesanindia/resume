package com.resume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "rsg_computerproficiency")
public class Computerproficiency {

	@Id
	@Column(name="skills_id")
	@TableGenerator(name = "rsg_gen", allocationSize = 1, initialValue = 1, table = "rsg_tbl_gen", valueColumnName = "value", pkColumnName = "id", pkColumnValue = "skills_id")
	@GeneratedValue(generator="rsg_gen",strategy = GenerationType.TABLE)
	private int id;

	@Column(name = "skills")
	private String skills;
	@Column(name = "tag_id")
	private int tagid;
	@Column(name = "value")
	private String value;

	public String getSkills() {
		return skills;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public int getTagid() {
		return tagid;
	}

	public void setTagid(int tagid) {
		this.tagid = tagid;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
