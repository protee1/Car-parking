package com.carpark.carservice;

import java.util.List;

import com.carpark.model.Car;

public interface CarService {
	
		public void save(Car car);
		public void delete(Car car);
		public void update(Car car);
		public List<Car>carList();
}
