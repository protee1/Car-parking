package com.carpark.routerdao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carpark.model.Router;
@Repository
public class RouterDaoImpl implements RouterDao{
@Autowired
SessionFactory sessionFactory;
	public void save(Router router) {
		Session session=sessionFactory.getCurrentSession();
		session.save(router);
	}

	public void delete(Router router) {
sessionFactory.getCurrentSession().save(router)	;	
	}

	public void update(Router router) {
sessionFactory.getCurrentSession().delete(router);		
	}

	@SuppressWarnings("unchecked")
	public List<Router> routerList() {
		return sessionFactory.getCurrentSession().createCriteria(Router.class).list();
	}

}
