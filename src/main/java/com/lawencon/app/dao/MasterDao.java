package com.lawencon.app.dao;

import com.lawencon.app.model.JenisKendaraan;
import com.lawencon.app.model.Transportasi;
import com.lawencon.app.model.User;
import com.lawencon.app.model.Voucher;

public interface MasterDao {
	//impl user
	public void insertUser(User user) throws Exception;
	public boolean updateUser(User user) throws Exception;
	boolean deleteUser(Long id) throws Exception;
	public boolean validation(String username, String password) throws Exception;
	public String getName(String username, String password) throws Exception;
	//impl jenisKendaraan
	public void insertJenisKendaraan(JenisKendaraan jenisKendaraan) throws Exception;
	public boolean updateJenisKendaraan(JenisKendaraan jenisKendaraan) throws Exception;
	public boolean deleteJenisKendaraan(Long id) throws Exception;
	//impl voucher
	public void insertVoucher(Voucher voucher) throws Exception;
	public boolean updateVoucher(Voucher voucher) throws Exception;
	public boolean deleteVoucher(Long id) throws Exception;
	//impl transportasi
	public void insertTransportasi(Transportasi transportasi);
	
}
