package com.lawencon.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_voucher")
public class Voucher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String namaVoucher;
	private double potongan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNamaVoucher() {
		return namaVoucher;
	}

	public void setNamaVoucher(String namaVoucher) {
		this.namaVoucher = namaVoucher;
	}

	public double getPotongan() {
		return potongan;
	}

	public void setPotongan(double potongan) {
		this.potongan = potongan;
	}

}
