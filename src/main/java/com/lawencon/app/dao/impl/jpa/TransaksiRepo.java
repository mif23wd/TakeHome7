package com.lawencon.app.dao.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lawencon.app.model.Transaksi;

public interface TransaksiRepo extends JpaRepository<Transaksi, Long>{
	public List<Transaksi> findByNoTransaksi(String noTransaksi);
}
