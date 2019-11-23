package com.carpark.ownerdao;

import java.util.List;

import com.carpark.model.Owner;

public interface OwnerDao {
public void save(Owner owner);
public void delete(Owner owner);
public void update(Owner owner);
public List<Owner>ownerList();
}
