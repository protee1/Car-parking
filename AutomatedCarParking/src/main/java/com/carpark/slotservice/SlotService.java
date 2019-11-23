package com.carpark.slotservice;

import java.util.List;

import com.carpark.model.Slot;

public interface SlotService {
	public void save(Slot slot);
	public void delete(Slot slot);
	public void update(Slot slot);
	public List<Slot> slotList();
}
