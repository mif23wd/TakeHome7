package com.lawencon.app.dao.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lawencon.app.model.Voucher;

public interface VoucherRepo extends JpaRepository<Voucher, Long>{
	public List<Voucher> findAllById(Long id);
}
