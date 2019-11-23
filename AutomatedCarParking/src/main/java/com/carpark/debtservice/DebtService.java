package com.carpark.debtservice;

import java.util.List;

import com.carpark.model.Debt;

public interface DebtService {
	public void save(Debt Debt);
	public void delete(Debt Debt);
	public void update (Debt Debt);
	public List<Debt> debtList();
}
