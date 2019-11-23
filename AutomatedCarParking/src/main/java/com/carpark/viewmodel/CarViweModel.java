package com.carpark.viewmodel;

import java.io.Serializable;
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

import com.carpark.carservice.CarService;
import com.carpark.model.Car;



@SuppressWarnings("serial")
@VariableResolver(DelegatingVariableResolver.class)
public class CarViweModel implements Serializable{
@WireVariable("service")
CarService services;
private Car cars;
private List<Car> listCars;
public CarService getServices() {
	return services;
}
public void setServices(CarService services) {
	this.services = services;
}
public Car getCars() {
	return cars;
}
public void setCars(Car cars) {
	this.cars = cars;
}
public List<Car> getListCars() {
	return listCars;
}
public void setListCars(List<Car> listCars) {
	this.listCars = listCars;
}
@Init
public void initialisation() {
	
	cars=new Car();
	listCars=new ListModelList<Car>(services.carList());
}
@Command
@NotifyChange({"listCars","cars"})
public void saveButton(@BindingParam("a") Car z) {
	services.save(getCars());
	initialisation();
	Clients.showNotification("Save successful!!!");
}
@Command
@NotifyChange({"listCars","cars"})
public void list() {
	listCars=services.carList();
}
@Command
@NotifyChange({"listCars","cars"})
public void deletion(@BindingParam("items") Car item) {
	services.delete(item);
	initialisation();
}
@Command
@NotifyChange({"listCars","cars"})
public void updating(@BindingParam("item") Car s) {
	services.update(s);
	initialisation();
}

}
