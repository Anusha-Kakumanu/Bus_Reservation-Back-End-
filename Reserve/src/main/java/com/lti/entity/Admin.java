package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBLADMIN")
public class Admin {
	@Id
	@GeneratedValue
	private int admid;
	private String admname;
	private String admcontact;
	private String admemail;
	private String username;
	private String password;

	@OneToMany(mappedBy = "admin")
	private List<Bus> buses;

	public int getAdmid() {
		return admid;
	}

	public void setAdmid(int admid) {
		this.admid = admid;
	}

	public String getAdmname() {
		return admname;
	}

	public void setAdmname(String admname) {
		this.admname = admname;
	}

	public String getAdmcontact() {
		return admcontact;
	}

	public void setAdmcontact(String admcontact) {
		this.admcontact = admcontact;
	}

	public String getAdmemail() {
		return admemail;
	}

	public void setAdmemail(String admemail) {
		this.admemail = admemail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Bus> getBuses() {
		return buses;
	}

	public void setBuses(List<Bus> buses) {
		this.buses = buses;
	}

	

}
