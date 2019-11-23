package com.carpark.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class SlotPrice {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int feesId;
private String feesName;
private String feesType;
private String feesCategory;
private String feesAmount;
public int getFeesId() {
	return feesId;
}
public void setFeesId(int feesId) {
	this.feesId = feesId;
}
public String getFeesName() {
	return feesName;
}
public void setFeesName(String feesName) {
	this.feesName = feesName;
}
public String getFeesType() {
	return feesType;
}
public void setFeesType(String feesType) {
	this.feesType = feesType;
}
public String getFeesCategory() {
	return feesCategory;
}
public void setFeesCategory(String feesCategory) {
	this.feesCategory = feesCategory;
}
public String getFeesAmount() {
	return feesAmount;
}
public void setFeesAmount(String feesAmount) {
	this.feesAmount = feesAmount;
}

}
