package com.carpark.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sensor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int sensorId;
public int getSensorId() {
	return sensorId;
}
public void setSensorId(int sensorId) {
	this.sensorId = sensorId;
}
public String getSensorCategory() {
	return SensorCategory;
}
public void setSensorCategory(String sensorCategory) {
	SensorCategory = sensorCategory;
}
public String getSensorName() {
	return SensorName;
}
public void setSensorName(String sensorName) {
	SensorName = sensorName;
}
public String getSensorType() {
	return sensorType;
}
public void setSensorType(String sensorType) {
	this.sensorType = sensorType;
}
private String SensorCategory;
private String SensorName;
private String sensorType;

}
