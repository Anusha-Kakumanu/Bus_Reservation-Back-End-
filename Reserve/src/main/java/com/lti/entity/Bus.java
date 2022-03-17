package com.lti.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tblbus")
public class Bus {
	@Id
	@GeneratedValue
	private int busId;
	private String busName;
	private int busNumber;
	private String source;
	private String destination;
	private int totalSeats;
	
	@ManyToOne
	@JoinColumn(name="adm_id")
	private Admin admin;
	
	@OneToMany(mappedBy="bus")
	private List<TravelSchedule> travelSchedule;

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public List<TravelSchedule> getTravelSchedule() {
		return travelSchedule;
	}

	public void setTravelSchedule(List<TravelSchedule> travelSchedule) {
		this.travelSchedule = travelSchedule;
	}
	
	
}
