package com.carpark.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class SitePrice {
private float sitePrice;
@OneToOne(targetEntity = Site.class,cascade = CascadeType.ALL)
private Site site;
public Site getSite() {
	return site;
}

public void setSite(Site site) {
	this.site = site;
}

public float getSitePrice() {
	return sitePrice;
}

public void setSitePrice(float sitePrice) {
	this.sitePrice = sitePrice;
}
}
