package com.lawencon.app.service;

import com.lawencon.app.model.Jadwal;
import com.lawencon.app.model.JenisKendaraan;
import com.lawencon.app.model.TransaksiTiket;
import com.lawencon.app.model.Transportasi;
import com.lawencon.app.model.User;
import com.lawencon.app.model.Voucher;

public interface AppService {
	//user
	 public String insertUserJpa(String username, String password, User user) throws Exception;
	 public String editUserJpa(String username, String password, User user) throws Exception;
	 public String deleteUserJpa(String username, String password, Long id) throws Exception;
	 
	 //jeniskendaraan
	 public String insertJenisKendaraanJpa(String username, String password, JenisKendaraan jenisKendaraan) throws Exception;
	 public String editJenisKendaraanJpa(String username, String password, JenisKendaraan jenisKendaraan) throws Exception;
	 public String deleteJenisKendaraanJpa(String username, String password, Long Id) throws Exception;
	 
	 //voucher
	 public String insertVoucherJpa(String username, String password, Voucher voucher) throws Exception;
	 public String editVoucherJpa(String username, String password, Voucher voucher) throws Exception;
	 public String deleteVoucherJpa(String username, String password, Long id) throws Exception;
	 
	 //transportasi
	 public String insertTransportasiJpa(String username, String password, Transportasi transportasi) throws Exception;
	 public String editTransportasiJpa(String username, String password, Transportasi transportasi) throws Exception;
	 public String deleteTransportasiJpa(String username, String password, Long id) throws Exception;
	 
	 //jadwal
	 public String insertJadwalJpa(String username, String password, Jadwal jadwal) throws Exception;
	 public String editJadwalJpa(String username, String password, Jadwal jadwal) throws Exception;
	 public String deleteJadwalJpa(String username, String password, Long id) throws Exception;
	 
	 //transaksi
	 public String insertAndCetakStrukJpa(String username, String password, TransaksiTiket transaksiTiket) throws Exception;
	 
	//user
	 public String insertUserHibernate(String username, String password, User user) throws Exception;
	 public String editUserHibernate(String username, String password, User user) throws Exception;
	 public String deleteUserHibernate(String username, String password, Long id) throws Exception;
	 
	 //jeniskendaraan
	 public String insertJenisKendaraanHibernate(String username, String password, JenisKendaraan jenisKendaraan) throws Exception;
	 public String editJenisKendaraanHibernate(String username, String password, JenisKendaraan jenisKendaraan) throws Exception;
	 public String deleteJenisKendaraanHibernate(String username, String password, Long Id) throws Exception;
	 
	 //voucher
	 public String insertVoucherHibernate(String username, String password, Voucher voucher) throws Exception;
	 public String editVoucherHibernate(String username, String password, Voucher voucher) throws Exception;
	 public String deleteVoucherHibernate(String username, String password, Long id) throws Exception;
	 
	 //transportasi
	 public String insertTransportasiHibernate(String username, String password, Transportasi transportasi) throws Exception;
	 public String editTransportasiHibernate(String username, String password, Transportasi transportasi) throws Exception;
	 public String deleteTransportasiHibernate(String username, String password, Long id) throws Exception;
	 
	 //jadwal
	 public String insertJadwalHibernate(String username, String password, Jadwal jadwal) throws Exception;
	 public String editJadwalHibernate(String username, String password, Jadwal jadwal) throws Exception;
	 public String deleteJadwalHibernate(String username, String password, Long id) throws Exception;
	 
	 //transaksi
	 public String insertAndCetakStrukHibernate(String username, String password, TransaksiTiket transaksiTiket) throws Exception;
}
