package com.resume.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "rsg_Basicprofile")
@Inheritance(strategy = InheritanceType.JOINED)
@TableGenerator(name = "rsg_gen", allocationSize = 1, initialValue = 1, table = "rsg_tbl_gen", valueColumnName = "value", pkColumnName = "id", pkColumnValue = "u_id")
public class Basicprofile {
	@Id
	@Column(name = "R_ID")
	@GeneratedValue(generator = "rsg_gen", strategy = GenerationType.TABLE)
	private int ID;

	@Column(name = "first_name")
	private String Firstname;

	@Column(name = "last_name")
	private String lastname;

	@Column(name = "father_name")
	private String Fathername;

	@Column(name = "age")
	private int age;

	@Column(name = "Email_id")
	private String emailId;

	@Column(name = "DOB")
	@Temporal(TemporalType.DATE)
	private String DOB;
	
	@Column(name="status")
	private boolean status;

	@Column(name = "publish")
	private boolean visible;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "R_ID")
	private Set<Academic> acadmey=new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "R_ID")
	private Set<Project> project=new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "R_ID")
	private Set<Computerproficiency> computer=new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "R_ID")
	private Set<JobExperience> job=new HashSet<>();

	public Set<JobExperience> getJob() {
		return job;
	}

	public void setJob(Set<JobExperience> job) {
		this.job = job;
	}

	public Set<Computerproficiency> getComputer() {
		return computer;
	}

	public void setComputer(Set<Computerproficiency> computer) {
		this.computer = computer;
	}

	public Set<Project> getProject() {
		return project;
	}

	public void setProject(Set<Project> project) {
		this.project = project;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Set<Academic> getAcadmey() {
		return acadmey;
	}

	public void setAcadmey(Set<Academic> acadmey) {
		this.acadmey = acadmey;
	}

	public String getFirstname() {
		return this.Firstname;
	}

	public void setFirstname(String firstname) {
		this.Firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFathername() {
		return Fathername;
	}

	public void setFathername(String fathername) {
		this.Fathername = fathername;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailid() {
		return emailId;
	}

	public void setEmailid(String emailid) {
		this.emailId = emailid;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		this.DOB = dOB;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
