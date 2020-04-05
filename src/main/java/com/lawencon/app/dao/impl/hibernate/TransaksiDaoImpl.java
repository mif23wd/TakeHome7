package com.lawencon.app.dao.impl.hibernate;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lawencon.app.dao.TransaksiDao;
import com.lawencon.app.model.Tiket;
import com.lawencon.app.model.Transaksi;

@Transactional
@Repository("trx_hibernate")
public class TransaksiDaoImpl implements TransaksiDao{

	@Override
	public void insertTiket(Tiket tiket) throws Exception {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void insertTransaksi(Transaksi transaksi) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editTransaksi(Transaksi transaksi) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transaksi findByNoTransaksi(String noTransaksi) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
