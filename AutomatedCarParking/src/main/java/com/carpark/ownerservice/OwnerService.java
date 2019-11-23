package com.carpark.ownerservice;

import java.util.List;

import com.carpark.model.Owner;

public interface OwnerService {
	public void save(Owner owner);
	public void delete(Owner owner);
	public void update(Owner owner);
	public List<Owner>ownerList();
}
