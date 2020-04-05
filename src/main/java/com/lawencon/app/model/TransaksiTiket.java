package com.lawencon.app.model;

import java.util.List;

public class TransaksiTiket {
	private Transaksi transaksi;
	private List<Tiket> listTiket;

	public Transaksi getTransaksi() {
		return transaksi;
	}

	public void setTransaksi(Transaksi transaksi) {
		this.transaksi = transaksi;
	}

	public List<Tiket> getListTiket() {
		return listTiket;
	}

	public void setListTiket(List<Tiket> listTiket) {
		this.listTiket = listTiket;
	}

}
