package com.lawencon.app.dao.impl.jpa;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lawencon.app.dao.MasterDao;
import com.lawencon.app.model.JenisKendaraan;
import com.lawencon.app.model.Transportasi;
import com.lawencon.app.model.User;
import com.lawencon.app.model.Voucher;

@Transactional
@Repository("master_jpa")
public class MasterDaoImpl implements MasterDao{

	@Autowired
	UserRepo userrepo;
	
	@Autowired
	JenisKendaraanRepo jkrepo;
	
	@Autowired
	VoucherRepo voucherrepo;
	
	@Autowired
	TransaksiRepo transrepo;
	
	@Override
	public void insertUser(User user) throws Exception {
		// TODO Auto-generated method stub
		userrepo.save(user);
	}

	@Override
	public boolean updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<>();
		list = userrepo.findAllById(user.getId());
		if (list.isEmpty()) {
			return false;
		}else {
			User u = list.get(0);
			u.setNamaUser(user.getNamaUser());
			u.setPassword(user.getPassword());
			u.setUsername(user.getUsername());
			userrepo.save(u);
			return true;
		}
		
	}

	@Override
	public boolean deleteUser(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<>();
		list = userrepo.findAllById(id);
		if (list.isEmpty()) {
			return false;
		}else {
			userrepo.delete(list.get(0));
			return true;
		}
	}

	@Override
	public boolean validation(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		List<User> temp = userrepo.findByUsernameAndPassword(username, password);
		if (temp.isEmpty()) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public String getName(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<>();
		list = userrepo.findByUsernameAndPassword(username, password);
		if (list.isEmpty()) {
			return list.get(0).getNamaUser();
		}else {
			return "lol";
		}
	}

	@Override
	public void insertJenisKendaraan(JenisKendaraan jenisKendaraan) throws Exception {
		// TODO Auto-generated method stub
		jkrepo.save(jenisKendaraan);
	}

	@Override
	public boolean updateJenisKendaraan(JenisKendaraan jenisKendaraan) throws Exception {
		// TODO Auto-generated method stub
		List<JenisKendaraan> list = new ArrayList<>();
		list = jkrepo.findAllById(jenisKendaraan.getId());
		if (list.isEmpty()) {
			return false;
		}else {
			jkrepo.save(jenisKendaraan);
			return true;
		}
	}

	@Override
	public boolean deleteJenisKendaraan(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<JenisKendaraan> list = new ArrayList<>();
		list = jkrepo.findAllById(id);
		if (list.isEmpty()) {
			return false;
		}else {
			jkrepo.delete(list.get(0));
			return true;
		}
	}

	@Override
	public void insertVoucher(Voucher voucher) throws Exception {
		// TODO Auto-generated method stub
		voucherrepo.save(voucher);
		
	}

	@Override
	public boolean updateVoucher(Voucher voucher) throws Exception {
		// TODO Auto-generated method stub
		List<Voucher> list = new ArrayList<>();
		list = voucherrepo.findAllById(voucher.getId());
		if (list.isEmpty()) {
			return false;
		}else {
			voucherrepo.save(voucher);
			return true;
		}
	}

	@Override
	public boolean deleteVoucher(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<Voucher> list = new ArrayList<>();
		list = voucherrepo.findAllById(id);
		if (list.isEmpty()) {
			return false;
		}else {
			voucherrepo.delete(list.get(0));
			return true;
		}
	}

	@Override
	public void insertTransportasi(Transportasi transportasi) {
		// TODO Auto-generated method stub
		//transrepo.save(transportasi);
	}

}
