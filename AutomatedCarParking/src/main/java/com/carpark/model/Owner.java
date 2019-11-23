package com.carpark.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Owner {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int ownerId;
private String ownerName;
private String ownerGender;
private String ownerEmail;
private float ownerPhone;
private String ownerZipCode;
private float ownerAge;
private float ownerIdentity;
public int getOwnerId() {
	return ownerId;
}
public void setOwnerId(int ownerId) {
	this.ownerId = ownerId;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public String getOwnerGender() {
	return ownerGender;
}
public void setOwnerGender(String ownerGender) {
	this.ownerGender = ownerGender;
}
public String getOwnerEmail() {
	return ownerEmail;
}
public void setOwnerEmail(String ownerEmail) {
	this.ownerEmail = ownerEmail;
}
public float getOwnerPhone() {
	return ownerPhone;
}
public void setOwnerPhone(float ownerPhone) {
	this.ownerPhone = ownerPhone;
}
public String getOwnerZipCode() {
	return ownerZipCode;
}
public void setOwnerZipCode(String ownerZipCode) {
	this.ownerZipCode = ownerZipCode;
}
public float getOwnerAge() {
	return ownerAge;
}
public void setOwnerAge(float ownerAge) {
	this.ownerAge = ownerAge;
}
public float getOwnerIdentity() {
	return ownerIdentity;
}
public void setOwnerIdentity(float ownerIdentity) {
	this.ownerIdentity = ownerIdentity;
}

}
