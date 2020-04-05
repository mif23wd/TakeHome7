package com.lawencon.app.dao;

import com.lawencon.app.model.Tiket;
import com.lawencon.app.model.Transaksi;

public interface TransaksiDao {
	//tiket
	public void insertTiket(Tiket tiket) throws Exception;
	
	//transaksi
	public void insertTransaksi(Transaksi transaksi) throws Exception;
	public void editTransaksi(Transaksi transaksi) throws Exception;
	public Transaksi findByNoTransaksi(String noTransaksi) throws Exception;
}
