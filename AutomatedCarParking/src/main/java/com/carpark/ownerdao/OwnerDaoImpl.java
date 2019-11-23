package com.carpark.ownerdao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carpark.model.Owner;
@Repository
public class OwnerDaoImpl implements OwnerDao {
@Autowired
SessionFactory sessionFactory;
	public void save(Owner owner) {
Session session=sessionFactory.getCurrentSession();
session.save(owner);
	}

	public void delete(Owner owner) {
Session session=sessionFactory.getCurrentSession();
session.delete(owner);


	}

	public void update(Owner owner) {
Session session=sessionFactory.getCurrentSession();
session.update(owner);
	}

	@SuppressWarnings("unchecked")
	public List<Owner> ownerList() {
Session session=sessionFactory.getCurrentSession();

return session.createCriteria(Owner.class).list();	}

}
