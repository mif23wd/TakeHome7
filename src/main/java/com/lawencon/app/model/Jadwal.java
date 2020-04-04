package com.lawencon.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_jadwal")
public class Jadwal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int noJadwal;
	private String waktu;
	@ManyToOne
	@JoinColumn(name = "trans_id")
	private Transportasi transportasi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNoJadwal() {
		return noJadwal;
	}

	public void setNoJadwal(int noJadwal) {
		this.noJadwal = noJadwal;
	}

	public String getWaktu() {
		return waktu;
	}

	public void setWaktu(String waktu) {
		this.waktu = waktu;
	}

	public Transportasi getTransportasi() {
		return transportasi;
	}

	public void setTransportasi(Transportasi transportasi) {
		this.transportasi = transportasi;
	}
}
