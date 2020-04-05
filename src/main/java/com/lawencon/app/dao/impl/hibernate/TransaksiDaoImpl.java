package com.lawencon.app.dao.impl.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lawencon.app.dao.TransaksiDao;
import com.lawencon.app.model.Tiket;
import com.lawencon.app.model.Transaksi;

@Transactional
@Repository("trx_hibernate")
public class TransaksiDaoImpl extends HibernateRepo implements TransaksiDao{

	@Override
	public void insertTiket(Tiket tiket) throws Exception {
		// TODO Auto-generated method stub
		em.persist(tiket);
	}

	@Override
	public void insertTransaksi(Transaksi transaksi) throws Exception {
		// TODO Auto-generated method stub
		em.persist(transaksi);
	}

	@Override
	public void editTransaksi(Transaksi transaksi) throws Exception {
		// TODO Auto-generated method stub
		em.merge(transaksi);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Transaksi findByNoTransaksi(String noTransaksi) throws Exception {
		// TODO Auto-generated method stub
		List<Transaksi> list = new ArrayList<>();
		Query q = em.createQuery("from Transaksi where noTransaksi = :param");
		q.setParameter("param", noTransaksi);
		list = q.getResultList();
		return list.get(0);
	}

}
