package com.carpark.debtdao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carpark.model.Debt;
@Repository
public class DebtDaoImpl implements DebtDao  {
@Autowired
SessionFactory sessionFactory;
	public void save(Debt Debt) {
Session session=sessionFactory.getCurrentSession();
session.save(Debt);
	}

	public void delete(Debt Debt) {
Session session=sessionFactory.getCurrentSession();
session.delete(Debt);
	}

	public void update(Debt Debt) {
Session session=sessionFactory.getCurrentSession();
session.update(Debt);
	}

	@SuppressWarnings("unchecked")
	public List<Debt> debtList() {
Session session=sessionFactory.getCurrentSession();
return session.createCriteria(Debt.class).list();
}

}
