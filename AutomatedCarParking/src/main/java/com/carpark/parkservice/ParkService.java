package com.carpark.parkservice;

import java.util.List;

import com.carpark.model.Park;

public interface ParkService {
	public void save(Park park);
	public void delete(Park park);
	public void update (Park park);
	public List<Park> parkList();
}
