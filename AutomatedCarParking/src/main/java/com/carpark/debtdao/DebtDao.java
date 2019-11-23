package com.carpark.debtdao;

import java.util.List;

import com.carpark.model.Debt;

public interface DebtDao {
public void save(Debt Debt);
public void delete(Debt Debt);
public void update (Debt Debt);
public List<Debt> debtList();
}
