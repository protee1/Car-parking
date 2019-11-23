package com.carpark.debtservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carpark.debtdao.DebtDao;
import com.carpark.model.Debt;

@Service("service")
public class DebtServiceImpl implements DebtService {
	@Autowired
	DebtDao debtdao;
@Transactional
	public void save(Debt Debt) {
debtdao.save(Debt);		
	}
@Transactional
	public void delete(Debt Debt) {
debtdao.delete(Debt);		
	}
@Transactional
	public void update(Debt Debt) {
debtdao.update(Debt);		
	}
@Transactional
	public List<Debt> debtList() {
		return debtdao.debtList();
	}

}
