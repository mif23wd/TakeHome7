package com.lawencon.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_m_transportasi")
public class Transportasi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String noTransportasi;
	@NotNull
	private String namaLayanan;
	@NotNull
	private int harga;
	@OneToOne
	@JoinColumn(name = "jk_id")
	private JenisKendaraan jenisKendaraan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNoTransportasi() {
		return noTransportasi;
	}

	public void setNoTransportasi(String noTransportasi) {
		this.noTransportasi = noTransportasi;
	}

	public String getNamaLayanan() {
		return namaLayanan;
	}

	public void setNamaLayanan(String namaLayanan) {
		this.namaLayanan = namaLayanan;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public JenisKendaraan getJenisKendaraan() {
		return jenisKendaraan;
	}

	public void setJenisKendaraan(JenisKendaraan jenisKendaraan) {
		this.jenisKendaraan = jenisKendaraan;
	}

}
