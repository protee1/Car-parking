package com.carpark.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class SlotBooked {
@SuppressWarnings("rawtypes")
private List slotBooked;
@OneToOne(targetEntity = Slot.class,cascade = CascadeType.ALL)
private Slot slot;

public Slot getSlot() {
	return slot;
}

public void setSlot(Slot slot) {
	this.slot = slot;
}

@SuppressWarnings("rawtypes")
public List getSlotBooked() {
	return slotBooked;
}

@SuppressWarnings("rawtypes")
public void setSlotBooked(List slotBooked) {
	this.slotBooked = slotBooked;
}
}
