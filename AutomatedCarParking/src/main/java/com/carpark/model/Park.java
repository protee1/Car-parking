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
public class Park {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int parkId;
	private String parkName;
	private String parkLocation;
	private String parkType;
	private String parkSize;
	@OneToOne(targetEntity = Park.class,cascade = CascadeType.ALL)
	private Park park;
	@OneToOne(targetEntity = Router.class,cascade = CascadeType.ALL)
	private Router router;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Park-slot")
	@JoinColumn(name="parkId")
	private List<Slot> slotList;
	@OneToOne(cascade = CascadeType.ALL,targetEntity = ParkPrice.class)
	private ParkPrice parkPrice;
	
	public ParkPrice getParkPrice() {
		return parkPrice;
	}
	public void setParkPrice(ParkPrice parkPrice) {
		this.parkPrice = parkPrice;
	}
	public List<Slot> getSlotList() {
		return slotList;
	}
	public void setSlotList(List<Slot> slotList) {
		this.slotList = slotList;
	}
	public Router getRouter() {
		return router;
	}
	public void setRouter(Router router) {
		this.router = router;
	}
	public Park getPark() {
		return park;
	}
	public void setPark(Park park) {
		this.park = park;
	}
	public int getParkId() {
		return parkId;
	}
	public void setParkId(int parkId) {
		this.parkId = parkId;
	}
	public String getParkName() {
		return parkName;
	}
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	public String getParkLocation() {
		return parkLocation;
	}
	public void setParkLocation(String parkLocation) {
		this.parkLocation = parkLocation;
	}
	public String getParkType() {
		return parkType;
	}
	public void setParkType(String parkType) {
		this.parkType = parkType;
	}
	public String getParkSize() {
		return parkSize;
	}
	public void setParkSize(String parkSize) {
		this.parkSize = parkSize;
	}

}
