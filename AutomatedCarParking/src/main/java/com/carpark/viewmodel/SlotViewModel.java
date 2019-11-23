package com.carpark.viewmodel;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.ListModelList;

import com.carpark.model.Slot;
import com.carpark.slotservice.SlotService;

@VariableResolver(DelegatingVariableResolver.class)
public class SlotViewModel {
@WireVariable
SlotService services;
Slot slot;
List<Slot>listSlots;
public SlotService getServices() {
	return services;
}
public void setServices(SlotService services) {
	this.services = services;
}
public Slot getSlot() {
	return slot;
}
public void setSlot(Slot slot) {
	this.slot = slot;
}
public List<Slot> getListSlots() {
	return listSlots;
}
public void setListSlots(List<Slot> listSlots) {
	this.listSlots = listSlots;
}
@Init
public void initialisation() {
	slot=new Slot();
	listSlots=new ListModelList<Slot>(services.slotList());
}
@Command
@NotifyChange({"listSlots","slot"})
public void saving(@BindingParam("sv") Slot s) {
	services.save(s);
	initialisation();
	Clients.showNotification("save successfuly");
}
@Command
@NotifyChange({"listSlots","slot"})
public void list() {
	services.slotList();
	initialisation();
}
@Command
@NotifyChange({"listSlots","slot"})
public void deletion(@BindingParam("del") Slot s) {
	services.delete(s);
	initialisation();
}
@Command
@NotifyChange({"listSlots","slot"})
public void updating(@BindingParam("up") Slot s) {
	services.update(s);
}

}
