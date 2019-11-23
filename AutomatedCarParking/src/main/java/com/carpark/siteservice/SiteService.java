package com.carpark.siteservice;

import java.util.List;

import com.carpark.model.Site;

public interface SiteService {
	public void save(Site site);
	public void delete(Site site);
	public void update(Site site);
	public List<Site>siteList();
}
