package com.carpark.ownerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carpark.model.Owner;
import com.carpark.ownerdao.OwnerDao;

@Service("service")
public class OwnerServiceImpl implements OwnerService {
@Autowired
OwnerDao ownerDao;
@Transactional
	public void save(Owner owner) {
ownerDao.save(owner);		
	}
@Transactional
	public void delete(Owner owner) {
ownerDao.delete(owner);		
	}
@Transactional
	public void update(Owner owner) {
ownerDao.update(owner);		
	}
@Transactional
	public List<Owner> ownerList() {
		return ownerDao.ownerList();
	}

}
