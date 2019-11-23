package com.carpark.slotservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carpark.model.Slot;
import com.carpark.slotdao.SlotDao;

@Service("service")
public class SlotServiceImpl implements SlotService {
	@Autowired
	SlotDao slotDao;

	public void save(Slot slot) {
		slotDao.save(slot);
	}

	public void delete(Slot slot) {
slotDao.delete(slot);		
	}

	public void update(Slot slot) {
slotDao.update(slot);		
	}

	public List<Slot> slotList() {
return slotDao.slotList();
	}

}
