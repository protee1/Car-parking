package com.carpark.sensordao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carpark.model.Sensor;
@Repository
public class SensorDaoImpl implements SensorDao {
@Autowired
SessionFactory sessionFactory;
	public void save(Sensor sensor) {
	Session session=sessionFactory.getCurrentSession();
	session.save(sensor);
	}

	public void delete(Sensor sensor) {
sessionFactory.getCurrentSession().delete(sensor);		
	}

	public void update(Sensor sensor) {
sessionFactory.getCurrentSession().saveOrUpdate(sensor);		
	}

	@SuppressWarnings("unchecked")
	public List<Sensor> sensorList() {
		return sessionFactory.getCurrentSession().createCriteria(Sensor.class).list();
	}

}
