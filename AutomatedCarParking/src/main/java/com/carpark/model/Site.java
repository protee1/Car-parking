package com.carpark.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Site {
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int siteId;
	private String siteName;
	private String siteType;
	private String siteLocation;
	private String siteSize;
	@OneToOne(targetEntity =SitePrice.class,cascade = CascadeType.ALL )
	private SitePrice sitePrice;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Site-Park")
	@JoinColumn(name="siteId")
	private List<Park>parkList;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Site-Router")
	@JoinColumn(name="siteId")
	private List<Router> routerList;
	
	public List<Router> getRouterList() {
		return routerList;
	}
	public void setRouterList(List<Router> routerList) {
		this.routerList = routerList;
	}
	public List<Park> getParkList() {
		return parkList;
	}
	public void setParkList(List<Park> parkList) {
		this.parkList = parkList;
	}
	public SitePrice getSitePrice() {
		return sitePrice;
	}
	public void setSitePrice(SitePrice sitePrice) {
		this.sitePrice = sitePrice;
	}
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getSiteType() {
		return siteType;
	}
	public void setSiteType(String siteType) {
		this.siteType = siteType;
	}
	public String getSiteLocation() {
		return siteLocation;
	}
	public void setSiteLocation(String siteLocation) {
		this.siteLocation = siteLocation;
	}
	public String getSiteSize() {
		return siteSize;
	}
	public void setSiteSize(String siteSize) {
		this.siteSize = siteSize;
	}
	
}
