package com.lawencon.app.dao.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lawencon.app.model.Jadwal;

public interface JadwalRepo extends JpaRepository<Jadwal, Long>{
	public List<Jadwal> findAllById(Long id);
}
