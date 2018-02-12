package com.resume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rsg_usercredential")
public class UserCredential {
	@Id
	@Column(name = "Email_id")
	private String emailId;
	@Column(name = "Password")
	private String password;
	@Column(name="auth_key")
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getEmailid() {
		return emailId;
	}

	public void setEmailid(String emailid) {
		this.emailId = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
