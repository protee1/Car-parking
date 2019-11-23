package com.carpark.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

@Entity
public class Router {
@GeneratedValue(strategy = GenerationType.IDENTITY )
private int routerId;
private String routerName;
private String routerType;
private String routerLocation;
private String routerSize;
@OneToOne(targetEntity = Park.class,cascade = CascadeType.ALL)
private Park park;

public Park getPark() {
	return park;
}
public void setPark(Park park) {
	this.park = park;
}
public int getRouterId() {
	return routerId;
}
public void setRouterId(int routerId) {
	this.routerId = routerId;
}
public String getRouterName() {
	return routerName;
}
public void setRouterName(String routerName) {
	this.routerName = routerName;
}
public String getRouterType() {
	return routerType;
}
public void setRouterType(String routerType) {
	this.routerType = routerType;
}
public String getRouterLocation() {
	return routerLocation;
}
public void setRouterLocation(String routerLocation) {
	this.routerLocation = routerLocation;
}
public String getRouterSize() {
	return routerSize;
}
public void setRouterSize(String routerSize) {
	this.routerSize = routerSize;
}
}
