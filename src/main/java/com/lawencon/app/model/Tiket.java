package com.lawencon.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_trx_tiket")
public class Tiket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String noTik;
	private String namaPenumpang;
	private int noBangku;
	@ManyToOne
	@JoinColumn(name = "trans_id")
	private Transportasi transportasi;
	@ManyToOne
	@JoinColumn(name = "trx_id")
	private Transaksi transaksi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNoTik() {
		return noTik;
	}

	public void setNoTik(String noTik) {
		this.noTik = noTik;
	}

	public String getNamaPenumpang() {
		return namaPenumpang;
	}

	public void setNamaPenumpang(String namaPenumpang) {
		this.namaPenumpang = namaPenumpang;
	}

	public int getNoBangku() {
		return noBangku;
	}

	public void setNoBangku(int noBangku) {
		this.noBangku = noBangku;
	}

	public Transportasi getTransportasi() {
		return transportasi;
	}

	public void setTransportasi(Transportasi transportasi) {
		this.transportasi = transportasi;
	}

	public Transaksi getTransaksi() {
		return transaksi;
	}

	public void setTransaksi(Transaksi transaksi) {
		this.transaksi = transaksi;
	}
}