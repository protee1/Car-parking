package com.carpark.slotdao;

import java.util.List;

import com.carpark.model.Slot;

public interface SlotDao {
public void save(Slot slot);
public void delete(Slot slot);
public void update(Slot slot);
public List<Slot> slotList();
}
