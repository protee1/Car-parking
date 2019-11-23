package com.carpark.parkdao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carpark.model.Park;
@Repository
public class ParkDaoImpl implements ParkDao {
@Autowired
SessionFactory sessionFactory;
	public void save(Park park) {
Session session=sessionFactory.getCurrentSession();
session.save(park);

	}

	public void delete(Park park) {
Session session=sessionFactory.getCurrentSession();
session.delete(park);
	}

	public void update(Park park) {
Session session=sessionFactory.getCurrentSession();
session.update(park);
	}

	@SuppressWarnings("unchecked")
	public List<Park> parkList() {
Session session=sessionFactory.getCurrentSession();
return session.createCriteria(Park.class).list();	}

}
