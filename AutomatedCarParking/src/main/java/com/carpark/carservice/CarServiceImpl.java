package com.carpark.carservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carpark.cardao.CarDao;
import com.carpark.model.Car;

@Service("service")
public class CarServiceImpl implements CarService{
	@Autowired
	CarDao cardao;
@Transactional
	public void save(Car car) {
	cardao.save(car);	
	}
@Transactional
	public void delete(Car car) {
	cardao.delete(car);	
	}
@Transactional
	public void update(Car car) {
cardao.update(car);		
	}
@Transactional
	public List<Car> carList() {
 return cardao.carList();
	}

}
