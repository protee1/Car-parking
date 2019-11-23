package com.carpark.viewmodel;

import java.util.List;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.ListModelList;

import com.carpark.model.Park;
import com.carpark.parkservice.ParkService;

@VariableResolver(DelegatingVariableResolver.class)
public class ParkViewModel {
@WireVariable("service")
ParkService services;
Park parks;
List<Park> listpark;
public ParkService getServices() {
	return services;
}
public void setServices(ParkService services) {
	this.services = services;
}
public Park getParks() {
	return parks;
}
public void setParks(Park parks) {
	this.parks = parks;
}
public List<Park> getListpark() {
	return listpark;
}
public void setListpark(List<Park> listpark) {
	this.listpark = listpark;
}
@Init
public void initialisation() {
	parks=new Park();
	listpark=new ListModelList<Park>(services.parkList());
}
@Command
@NotifyChange({"listpark","parks"})
public void saving(@BindingParam("sav") Park p) {
	services.save(p);
	initialisation();
	Clients.showNotification("save successfull");
}
@Command
@NotifyChange({"listpark","parks"})
public void list() {
	services.parkList();
}
@Command
@NotifyChange({"listpark","parks"})
public void deletion(@BindingParam("del") Park d) {
	services.delete(d);
	initialisation();
}
@Command
@NotifyChange({"listpark","parks"})
public void updating(@BindingParam("up") Park u) {
	
	services.update(u);
	initialisation();
}
}
