package com.carpark.model;

import javax.persistence.Entity;

@Entity
public class ParkPrice {
private float parkFees;

public float getParkFees() {
	return parkFees;
}

public void setParkFees(float parkFees) {
	this.parkFees = parkFees;
}
}
