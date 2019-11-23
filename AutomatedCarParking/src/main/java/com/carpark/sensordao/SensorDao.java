package com.carpark.sensordao;

import java.util.List;

import com.carpark.model.Sensor;

public interface SensorDao {
public void save(Sensor sensor);
public void delete(Sensor sensor);
public void update(Sensor sensor);
public List<Sensor> sensorList();
}
