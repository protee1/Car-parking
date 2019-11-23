package com.carpark.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Slot {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int slotId;
private String slotName;
private String slotLocation;
private String slotType;
private String slotStatus;
private String slotSize;
@OneToOne(targetEntity = SlotBooked.class,cascade = CascadeType.ALL)
private SlotBooked slotBooked;
@OneToOne(targetEntity = SlotPrice.class,cascade = CascadeType.ALL)
private SlotPrice slotPrice;
@OneToOne(targetEntity = SlotPrice.class,cascade = CascadeType.ALL)

public SlotBooked getSlotBooked() {
	return slotBooked;
}
public SlotPrice getSlotPrice() {
	return slotPrice;
}
public void setSlotPrice(SlotPrice slotPrice) {
	this.slotPrice = slotPrice;
}
public void setSlotBooked(SlotBooked slotBooked) {
	this.slotBooked = slotBooked;
}
public int getSlotId() {
	return slotId;
}
public void setSlotId(int slotId) {
	this.slotId = slotId;
}
public String getSlotName() {
	return slotName;
}
public void setSlotName(String slotName) {
	this.slotName = slotName;
}
public String getSlotLocation() {
	return slotLocation;
}
public void setSlotLocation(String slotLocation) {
	this.slotLocation = slotLocation;
}
public String getSlotType() {
	return slotType;
}
public void setSlotType(String slotType) {
	this.slotType = slotType;
}
public String getSlotStatus() {
	return slotStatus;
}
public void setSlotStatus(String slotStatus) {
	this.slotStatus = slotStatus;
}
public String getSlotSize() {
	return slotSize;
}
public void setSlotSize(String slotSize) {
	this.slotSize = slotSize;
}

}
