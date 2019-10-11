package com.capgemini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//We will be using the Entity Annotation because we will be using JPA
@Entity
@Table(name = "busdetails")
public class Bus {
	// The Column annotation will ensure that the fields are connected to the
	// database table
	@Id
	@Column(name = "busid")
	private int busId;
	@Column(name = "bustravelname")
	private String busTravelName;
	@Column(name = "source")
	private String source;
	@Column(name = "destination")
	private String destination;
	@Column(name = "availableseats")
	private int availableSeats;
	//We will generate the getters and setters of all the private fields

	// Overriding the toString method
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busTravelName=" + busTravelName
				+ ", source=" + source + ", destination=" + destination
				+ ", availableSeats=" + availableSeats + "]";
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusTravelName() {
		return busTravelName;
	}

	public void setBusTravelName(String busTravelName) {
		this.busTravelName = busTravelName;
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

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

}
