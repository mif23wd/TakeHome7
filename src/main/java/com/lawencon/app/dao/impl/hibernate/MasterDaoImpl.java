package com.lawencon.app.dao.impl.hibernate;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lawencon.app.dao.MasterDao;
import com.lawencon.app.model.JenisKendaraan;
import com.lawencon.app.model.Transportasi;
import com.lawencon.app.model.User;
import com.lawencon.app.model.Voucher;

@Transactional
@Repository("master_hibernate")
public class MasterDaoImpl extends HibernateRepo implements MasterDao{

	@Override
	public void insertUser(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(Long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validation(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertJenisKendaraan(JenisKendaraan jenisKendaraan) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateJenisKendaraan(JenisKendaraan jenisKendaraan) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteJenisKendaraan(Long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void insertVoucher(Voucher voucher) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateVoucher(Voucher voucher) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteVoucher(Long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void insertTransportasi(Transportasi transportasi) {
		// TODO Auto-generated method stub
		
	}
	
}
