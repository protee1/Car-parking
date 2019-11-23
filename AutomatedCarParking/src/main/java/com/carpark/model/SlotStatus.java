package com.carpark.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

@Entity
public class SlotStatus {
@GeneratedValue(strategy = GenerationType.IDENTITY)
private String slotStatus;
@OneToOne(targetEntity = Slot.class,cascade = CascadeType.ALL)
private Slot slot;
public String getSlotStatus() {
	return slotStatus;
}

public void setSlotStatus(String slotStatus) {
	this.slotStatus = slotStatus;
}
}
