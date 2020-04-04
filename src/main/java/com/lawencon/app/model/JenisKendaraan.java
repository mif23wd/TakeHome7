package com.lawencon.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_jenisKendaraan")
public class JenisKendaraan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String namaKendaraan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNamaKendaraan() {
		return namaKendaraan;
	}

	public void setNamaKendaraan(String namaKendaraan) {
		this.namaKendaraan = namaKendaraan;
	}

}
