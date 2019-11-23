package com.carpark.siteDao;

import java.util.List;

import com.carpark.model.Site;

public interface SiteDao {
public void save(Site site);
public void delete(Site site);
public void update(Site site);
public List<Site>siteList();

}
