package com.lawencon.app.dao.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lawencon.app.model.Transportasi;

public interface TransportasiRepo extends JpaRepository<Transportasi, Long>{
	public List<Transportasi> findAllById(Long id);
}
