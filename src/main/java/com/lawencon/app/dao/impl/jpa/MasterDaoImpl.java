package com.lawencon.app.dao.impl.jpa;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lawencon.app.dao.MasterDao;
import com.lawencon.app.model.Jadwal;
import com.lawencon.app.model.JenisKendaraan;
import com.lawencon.app.model.Transportasi;
import com.lawencon.app.model.User;
import com.lawencon.app.model.Voucher;

@Transactional
@Repository("master_jpa")
public class MasterDaoImpl implements MasterDao {

	@Autowired
	UserRepo userrepo;

	@Autowired
	JenisKendaraanRepo jkrepo;

	@Autowired
	VoucherRepo voucherrepo;

	@Autowired
	TransportasiRepo transrepo;
	
	@Autowired
	JadwalRepo jadwalrepo;

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
		} else {
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
		} else {
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
		} else {
			return true;
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
		} else {
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
		} else {
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
		} else {
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
		} else {
			voucherrepo.delete(list.get(0));
			return true;
		}
	}

	@Override
	public void insertTransportasi(Transportasi transportasi) {
		// TODO Auto-generated method stub
		transrepo.save(transportasi);
	}

	@Override
	public boolean updateTransportasi(Transportasi transportasi) throws Exception {
		// TODO Auto-generated method stub
		List<Transportasi> list = new ArrayList<>();
		list = transrepo.findAllById(transportasi.getId());
		if (list.isEmpty()) {
			return false;
		} else {
			transrepo.save(transportasi);
			return true;
		}
	}

	@Override
	public boolean deleteTransportasi(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<Transportasi> list = new ArrayList<>();
		list = transrepo.findAllById(id);
		if (list.isEmpty()) {
			return false;
		} else {
			transrepo.delete(list.get(0));
			return true;
		}
	}

	@Override
	public void insertJadwal(Jadwal jadwal) throws Exception {
		// TODO Auto-generated method stub
		jadwalrepo.save(jadwal);
	}

	@Override
	public boolean updateJadwal(Jadwal jadwal) throws Exception {
		// TODO Auto-generated method stub
		List<Jadwal> list = new ArrayList<>();
		list = jadwalrepo.findAllById(jadwal.getId());
		if (list.isEmpty()) {
			return false;
		} else {
			jadwalrepo.save(jadwal);
			return true;
		}
	}

	@Override
	public boolean deleteJadwal(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<Jadwal> list = new ArrayList<>();
		list = jadwalrepo.findAllById(id);
		if (list.isEmpty()) {
			return false;
		} else {
			jadwalrepo.delete(list.get(0));
			return true;
		}
	}

	@Override
	public User findByUsernameAndPassword(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		List<User> list = userrepo.findByUsernameAndPassword(username, password);
		return list.get(0);
	}

	@Override
	public JenisKendaraan findByIdJenisKendaraan(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<JenisKendaraan> list = jkrepo.findAllById(id);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public Voucher findByNamaVoucher(String namaVoucher) throws Exception {
		// TODO Auto-generated method stub
		List<Voucher> list = voucherrepo.findByNamaVoucher(namaVoucher);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public Transportasi findByIdTranspostasi(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<Transportasi> list = transrepo.findAllById(id);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public Jadwal findByIdJadwal(Long id) {
		// TODO Auto-generated method stub
		List<Jadwal> list = jadwalrepo.findAllById(id);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

}
