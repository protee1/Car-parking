package com.carpark.siteDao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carpark.model.Site;
@Repository
public class SiteDaoImpl implements SiteDao {
@Autowired
SessionFactory sessionFactory;
	public void save(Site site) {
Session session=sessionFactory.getCurrentSession();
session.save(site);
	}

	public void delete(Site site) {
sessionFactory.getCurrentSession().delete(site);
	}

	public void update(Site site) {
sessionFactory.getCurrentSession().saveOrUpdate(site);
	}

	@SuppressWarnings("unchecked")
	public List<Site> siteList() {
		return sessionFactory.getCurrentSession().createCriteria(Site.class).list();
	}

}
