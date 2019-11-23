package com.carpark.routerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carpark.model.Router;
import com.carpark.routerdao.RouterDao;

@Service
public class RouterServiceImpl implements RouterService {
	@Autowired
	RouterDao routerDao;
@Transactional
	public void save(Router router) {
routerDao.save(router);		
	}
@Transactional
	public void delete(Router router) {
routerDao.delete(router);		
	}
@Transactional
	public void update(Router router) {
routerDao.update(router);		
	}
@Transactional
	public List<Router> routerList() {
		return routerDao.routerList();
	}

}
