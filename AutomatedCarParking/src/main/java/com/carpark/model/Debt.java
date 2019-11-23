package com.carpark.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Debt {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int debtId;
private String debtName;
private Date debtDate;
private float debtAmount;
private String debtType;
public int getDebtId() {
	return debtId;
}
public void setDebtId(int debtId) {
	this.debtId = debtId;
}
public String getDebtName() {
	return debtName;
}
public void setDebtName(String debtName) {
	this.debtName = debtName;
}
public Date getDebtDate() {
	return debtDate;
}
public void setDebtDate(Date debtDate) {
	this.debtDate = debtDate;
}
public float getDebtAmount() {
	return debtAmount;
}
public void setDebtAmount(float debtAmount) {
	this.debtAmount = debtAmount;
}
public String getDebtType() {
	return debtType;
}
public void setDebtType(String debtType) {
	this.debtType = debtType;
}
}
