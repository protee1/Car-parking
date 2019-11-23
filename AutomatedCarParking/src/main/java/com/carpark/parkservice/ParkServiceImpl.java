package com.carpark.parkservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carpark.model.Park;
import com.carpark.parkdao.ParkDao;

@Service("service")
public class ParkServiceImpl implements ParkService {
@Autowired
ParkDao parkDao;
@Transactional

	public void save(Park park) {
parkDao.save(park);		
	}
@Transactional
	public void delete(Park park) {
parkDao.delete(park);		
	}
@Transactional
	public void update(Park park) {
parkDao.update(park);	
	}
@Transactional
	public List<Park> parkList() {
		return parkDao.parkList();
	}

}
