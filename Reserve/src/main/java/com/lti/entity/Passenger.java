package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblpassenger")
public class Passenger {
	@Id
	@GeneratedValue
	private int passId;
	private String passName;
	private int passAge;
	private String passGender;
	
	@OneToOne
	@JoinColumn(name="booking_id")
	private Booking booking;
	
	@OneToOne
	@JoinColumn(name="seat_id")
	private SeatMapping seatMapping;

	public int getPassId() {
		return passId;
	}

	public void setPassId(int passId) {
		this.passId = passId;
	}

	public String getPassName() {
		return passName;
	}

	public void setPassName(String passName) {
		this.passName = passName;
	}

	public int getPassAge() {
		return passAge;
	}

	public void setPassAge(int passAge) {
		this.passAge = passAge;
	}

	public String getPassGender() {
		return passGender;
	}

	public void setPassGender(String passGender) {
		this.passGender = passGender;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public SeatMapping getSeatMapping() {
		return seatMapping;
	}

	public void setSeatMapping(SeatMapping seatMapping) {
		this.seatMapping = seatMapping;
	}
	
	
	
}
