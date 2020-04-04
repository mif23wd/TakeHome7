package com.lawencon.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_trx_transaksi")
public class Transaksi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String noTransaksi;
	private long totalBayar;
	@OneToOne
	@JoinColumn(name = "voucher_id")
	private Voucher voucher;
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNoTransaksi() {
		return noTransaksi;
	}

	public void setNoTransaksi(String noTransaksi) {
		this.noTransaksi = noTransaksi;
	}

	public long getTotalBayar() {
		return totalBayar;
	}

	public void setTotalBayar(long totalBayar) {
		this.totalBayar = totalBayar;
	}

	public Voucher getVoucher() {
		return voucher;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
