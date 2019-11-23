package com.carpark.cardao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carpark.model.Car;
@Repository
public class CarDaoImpl implements CarDao {
@Autowired
SessionFactory sessionFactory;
	public void save(Car car) {
Session session=sessionFactory.getCurrentSession();
session.save(car);
	}

	public void delete(Car car) {
Session session=sessionFactory.getCurrentSession();
session.delete(car);
	}

	public void update(Car car) {
Session session=sessionFactory.getCurrentSession();
session.update(car);
	}

	@SuppressWarnings("unchecked")
	public List<Car> carList() {
Session session=sessionFactory.getCurrentSession();
return session.createCriteria(Car.class).list();
	}

}
