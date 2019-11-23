package com.carpark.slotdao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carpark.model.Slot;
@Repository
public class SlotDaoImpl implements SlotDao {
@Autowired
SessionFactory sessionFactory;
	public void save(Slot slot) {
	Session session=sessionFactory.getCurrentSession();
	session.save(slot);
	
	
	}

	public void delete(Slot slot) {
sessionFactory.getCurrentSession().delete(slot);		
	}

	public void update(Slot slot) {
sessionFactory.getCurrentSession().saveOrUpdate(slot);		
	}

	@SuppressWarnings("unchecked")
	public List<Slot> slotList() {
		return sessionFactory.getCurrentSession().createCriteria(Slot.class).list();
	}

}
