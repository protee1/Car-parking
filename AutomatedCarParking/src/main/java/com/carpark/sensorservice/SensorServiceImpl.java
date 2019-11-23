package com.carpark.sensorservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carpark.model.Sensor;
import com.carpark.sensordao.SensorDao;

@Service("service")
public class SensorServiceImpl implements SensorService {
	@Autowired
	SensorDao sensorDao;
	
@Transactional
	public void save(Sensor sensor) {
sensorDao.save(sensor);		
	}
@Transactional
	public void delete(Sensor sensor) {
sensorDao.delete(sensor);		
	}
@Transactional
	public void update(Sensor sensor) {
sensorDao.update(sensor);		
	}
@Transactional
	public List<Sensor> sensorList() {
		return sensorDao.sensorList();
	}

}
