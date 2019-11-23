package com.carpark.routerdao;

import java.util.List;

import com.carpark.model.Router;

public interface RouterDao {
public void save(Router router);
public void delete(Router router);
public void update(Router router);
public List<Router>routerList();
}
