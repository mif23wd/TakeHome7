package com.lawencon.app.dao.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lawencon.app.model.Transaksi;

public interface TransaksiRepo extends JpaRepository<Transaksi, Long>{
	
}
