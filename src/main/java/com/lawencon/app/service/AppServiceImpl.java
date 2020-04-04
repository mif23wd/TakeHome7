package com.lawencon.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lawencon.app.dao.MasterDao;
import com.lawencon.app.model.JenisKendaraan;
import com.lawencon.app.model.User;
import com.lawencon.app.model.Voucher;

@Service
public class AppServiceImpl implements AppService{
	
	@Autowired
	@Qualifier("master_jpa")
	MasterDao masterjpa;

	@Override
	public String insertUserJpa(String username, String password, User user) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			masterjpa.insertUser(user);
			notif = "data user telah dimasukan";
		}else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String editUserJpa(String username, String password, User user) throws Exception{
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			if (masterjpa.updateUser(user)) {
				return "data user telah diubah";
			}else {
				return "id user yang dimasukan tidak ada";
			}
		}else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String deleteUserJpa(String username, String password, Long id) throws Exception{
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			if (masterjpa.deleteUser(id)) {
				return "data user telah dihapus";
			}else {
				return "id user yang dimasukan tidak ada";
			}
		}else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String insertJenisKendaraanJpa(String username, String password, JenisKendaraan jenisKendaraan)
			throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			masterjpa.insertJenisKendaraan(jenisKendaraan);
			notif = "data jenis kendaraan telah dimasukan";
		}else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String editJenisKendaraanJpa(String username, String password, JenisKendaraan jenisKendaraan)
			throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			if (masterjpa.updateJenisKendaraan(jenisKendaraan)) {
				return "data jenis telah diubah";
			}else {
				return "id jenis kendaraan yang dimasukan tidak ada";
			}
		}else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String deleteJenisKendaraanJpa(String username, String password, Long Id) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			if (masterjpa.deleteJenisKendaraan(Id)) {
				return "data jenis kendaraan telah dihapus";
			}else {
				return "id jenis kendaraan yang dimasukan tidak ada";
			}
		}else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String insertVoucherJpa(String username, String password, Voucher voucher) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			masterjpa.insertVoucher(voucher);
			notif = "data voucher telah dimasukan";
		}else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String editVoucherJpa(String username, String password, Voucher voucher) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			if (masterjpa.updateVoucher(voucher)) {
				return "data voucher telah diubah";
			}else {
				return "id voucher yang dimasukan tidak ada";
			}
		}else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String deleteVoucherJpa(String username, String password, Long id) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			if (masterjpa.deleteVoucher(id)) {
				return "data voucher telah dihapus";
			}else {
				return "id voucher yang dimasukan tidak ada";
			}
		}else {
			notif = "username & password salah";
		}
		return notif;
	}

}
