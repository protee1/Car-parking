package com.carpark.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class CarHistory {
private String carHistory;
@OneToOne(targetEntity = Car.class,cascade = CascadeType.ALL)
private Car car;

public Car getCar() {
	return car;
}

public void setCar(Car car) {
	this.car = car;
}

public String getCarHistory() {
	return carHistory;
}

public void setCarHistory(String carHistory) {
	this.carHistory = carHistory;
}

}
