package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblseatmapping")
public class SeatMapping {
	@Id
	@GeneratedValue
	private int seatId;
	private int seatNumber;
	

}
