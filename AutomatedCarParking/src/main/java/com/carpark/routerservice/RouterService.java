package com.carpark.routerservice;

import java.util.List;

import com.carpark.model.Router;

public interface RouterService {
	public void save(Router router);
	public void delete(Router router);
	public void update(Router router);
	public List<Router>routerList();
}
