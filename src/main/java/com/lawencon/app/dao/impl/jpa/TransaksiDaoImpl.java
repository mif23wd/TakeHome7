package com.lawencon.app.dao.impl.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lawencon.app.dao.TransaksiDao;
import com.lawencon.app.model.Tiket;
import com.lawencon.app.model.Transaksi;

@Transactional
@Repository("trx_jpa")
public class TransaksiDaoImpl implements TransaksiDao{
	
	@Autowired
	TransaksiRepo trxrepo;
	
	@Autowired
	TiketRepo tiketrepo;

	@Override
	public void insertTiket(Tiket tiket) throws Exception {
		// TODO Auto-generated method stub
		tiketrepo.save(tiket);
		
	}

	@Override
	public void insertTransaksi(Transaksi transaksi) throws Exception {
		// TODO Auto-generated method stub
		trxrepo.save(transaksi);
		
	}

	@Override
	public void editTransaksi(Transaksi transaksi) throws Exception {
		// TODO Auto-generated method stub
		trxrepo.save(transaksi);
	}

	@Override
	public Transaksi findByNoTransaksi(String noTransaksi) throws Exception {
		// TODO Auto-generated method stub
		List<Transaksi> list = new ArrayList<>();
		list = trxrepo.findByNoTransaksi(noTransaksi);
		return list.get(0);
	}

}
