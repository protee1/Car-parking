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

import com.carpark.model.Owner;
import com.carpark.ownerservice.OwnerService;

@VariableResolver(DelegatingVariableResolver.class)
public class OwnerViewModel {
@WireVariable("service")
OwnerService services;
private Owner owners;
private List<Owner> listOwners;
public OwnerService getServices() {
	return services;
}
public void setServices(OwnerService services) {
	this.services = services;
}
public Owner getOwners() {
	return owners;
}
public void setOwners(Owner owners) {
	this.owners = owners;
}
public List<Owner> getListOwners() {
	return listOwners;
}
public void setListOwners(List<Owner> listOwners) {
	this.listOwners = listOwners;
}
@Init
public void initialisation() {
	owners=new Owner();
	listOwners=new ListModelList<Owner>(services.ownerList());
}
@Command
@NotifyChange({"listOwners","owners"})
public void saving(@BindingParam("a") Owner o) {
	services.save(getOwners());
	initialisation();
	Clients.showNotification("Save successfull!!!!");
}
@Command
@NotifyChange({"listOwners","owners"})
public void list() {
	listOwners=services.ownerList();
}
@Command
@NotifyChange({"listOwners","owners"})
public void deletion(@BindingParam("del") Owner d) {
	services.delete(d);
	initialisation();
}
@Command
@NotifyChange({"listOwners","owners"})
public void updating(@BindingParam("up") Owner o) {
	services.update(o);
	initialisation();
}
}
