package com.lawencon.app.service;

import com.lawencon.app.model.JenisKendaraan;
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
}
