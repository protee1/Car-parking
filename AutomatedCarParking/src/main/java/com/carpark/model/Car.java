package com.carpark.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Car {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int carId;
private String CarName;
private String TinNo;
private String carModel;
private String PlkNo;
private String carClolor;
private String carSize;
private String carType;
@OneToOne(targetEntity = CarHistory.class,cascade = CascadeType.ALL)
private CarHistory carHistory;
@OneToMany(cascade = CascadeType.ALL)
@JoinTable(name="Car-Debt")
@JoinColumn(name="carId")
private List<Debt> debtList;
@ManyToMany(cascade = CascadeType.ALL,targetEntity = Owner.class)
@JoinTable(name="Car-Owner",
joinColumns = @JoinColumn(name="carId"),
inverseJoinColumns = @JoinColumn(name="ownerId"))
private List<Owner> ownerList;

public List<Owner> getOwnerList() {
	return ownerList;
}
public void setOwnerList(List<Owner> ownerList) {
	this.ownerList = ownerList;
}
public List<Debt> getDebtList() {
	return debtList;
}
public void setDebtList(List<Debt> debtList) {
	this.debtList = debtList;
}
public CarHistory getCarHistory() {
	return carHistory;
}
public void setCarHistory(CarHistory carHistory) {
	this.carHistory = carHistory;
}
public int getCarId() {
	return carId;
}
public void setCarId(int carId) {
	this.carId = carId;
}
public String getCarName() {
	return CarName;
}
public void setCarName(String carName) {
	CarName = carName;
}
public String getTinNo() {
	return TinNo;
}
public void setTinNo(String tinNo) {
	TinNo = tinNo;
}
public String getCarModel() {
	return carModel;
}
public void setCarModel(String carModel) {
	this.carModel = carModel;
}
public String getPlkNo() {
	return PlkNo;
}
public void setPlkNo(String plkNo) {
	PlkNo = plkNo;
}
public String getCarClolor() {
	return carClolor;
}
public void setCarClolor(String carClolor) {
	this.carClolor = carClolor;
}
public String getCarSize() {
	return carSize;
}
public void setCarSize(String carSize) {
	this.carSize = carSize;
}
public String getCarType() {
	return carType;
}
public void setCarType(String carType) {
	this.carType = carType;
}
}
