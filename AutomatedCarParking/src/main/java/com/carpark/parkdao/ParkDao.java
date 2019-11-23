package com.carpark.parkdao;

import java.util.List;

import com.carpark.model.Park;

public interface ParkDao {
public void save(Park park);
public void delete(Park park);
public void update (Park park);
public List<Park> parkList();
}
