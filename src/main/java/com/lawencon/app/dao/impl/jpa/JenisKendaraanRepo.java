package com.lawencon.app.dao.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lawencon.app.model.JenisKendaraan;

public interface JenisKendaraanRepo extends JpaRepository<JenisKendaraan, Long>{
	public List<JenisKendaraan> findAllById(Long id);
}
