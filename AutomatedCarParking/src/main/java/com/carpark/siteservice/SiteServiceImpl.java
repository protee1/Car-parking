package com.carpark.siteservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carpark.model.Site;
import com.carpark.siteDao.SiteDao;

@Service("service")
public class SiteServiceImpl implements SiteService {
	@Autowired
	SiteDao siteDao;
	
@Transactional
	public void save(Site site) {
	siteDao.save(site);	
	}
@Transactional
	public void delete(Site site) {
siteDao.delete(site);		

	}
@Transactional
	public void update(Site site) {
siteDao.update(site);		
	}
@Transactional
	public List<Site> siteList() {
		return siteDao.siteList();
	}

}
