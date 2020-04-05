package com.lawencon.app.dao.impl.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lawencon.app.dao.MasterDao;
import com.lawencon.app.model.Jadwal;
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
		em.persist(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<>();
		Query q = em.createQuery("from User where id = :param");
		q.setParameter("param", user.getId());
		list = q.getResultList();
		if (list.isEmpty()) {
			return false;
		} else {
			User u = list.get(0);
			u.setNamaUser(user.getNamaUser());
			u.setPassword(user.getPassword());
			u.setUsername(user.getUsername());
			em.merge(u);
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean deleteUser(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<>();
		Query q = em.createQuery("from User where id = :param");
		q.setParameter("param", id);
		list = q.getResultList();
		if (list.isEmpty()) {
			return false;
		} else {
			em.remove(list.get(0));
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean validation(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		List<User> temp = new ArrayList<>();
		Query q = em.createQuery("from User where username = :param1 and password = :param2");
		q.setParameter("param1", username);
		q.setParameter("param2", password);
		temp = q.getResultList();
		if (temp.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void insertJenisKendaraan(JenisKendaraan jenisKendaraan) throws Exception {
		// TODO Auto-generated method stub
		em.persist(jenisKendaraan);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean updateJenisKendaraan(JenisKendaraan jenisKendaraan) throws Exception {
		// TODO Auto-generated method stub
		List<JenisKendaraan> list = new ArrayList<>();
		Query q = em.createQuery("from JenisKendaraan where id = :param");
		q.setParameter("param", jenisKendaraan.getId());
		list = q.getResultList();
		if (list.isEmpty()) {
			return false;
		} else {
			em.merge(jenisKendaraan);
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean deleteJenisKendaraan(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<JenisKendaraan> list = new ArrayList<>();
		Query q = em.createQuery("from JenisKendaraan where id = :param");
		q.setParameter("param", id);
		list = q.getResultList();
		if (list.isEmpty()) {
			return false;
		} else {
			em.remove(list.get(0));
			return true;
		}
	}

	@Override
	public void insertVoucher(Voucher voucher) throws Exception {
		// TODO Auto-generated method stub
		em.persist(voucher);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean updateVoucher(Voucher voucher) throws Exception {
		// TODO Auto-generated method stub
		List<Voucher> list = new ArrayList<>();
		Query q = em.createQuery("from Voucher where id = :param");
		q.setParameter("param", voucher.getId());
		list = q.getResultList();
		if (list.isEmpty()) {
			return false;
		} else {
			em.merge(voucher);
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean deleteVoucher(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<Voucher> list = new ArrayList<>();
		Query q = em.createQuery("from Voucher where id = :param");
		q.setParameter("param", id);
		list = q.getResultList();
		if (list.isEmpty()) {
			return false;
		} else {
			em.remove(list.get(0));
			return true;
		}
	}

	@Override
	public void insertTransportasi(Transportasi transportasi) throws Exception{
		// TODO Auto-generated method stub
		em.persist(transportasi);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean updateTransportasi(Transportasi transportasi) throws Exception {
		// TODO Auto-generated method stub
		List<Transportasi> list = new ArrayList<>();
		Query q = em.createQuery("from Transportasi where id = :param");
		q.setParameter("param", transportasi.getId());
		list = q.getResultList();
		if (list.isEmpty()) {
			return false;
		} else {
			em.merge(transportasi);
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean deleteTransportasi(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<Transportasi> list = new ArrayList<>();
		Query q = em.createQuery("from Transportasi where id = :param");
		q.setParameter("param", id);
		list = q.getResultList();
		if (list.isEmpty()) {
			return false;
		} else {
			em.remove(list.get(0));
			return true;
		}
	}

	@Override
	public void insertJadwal(Jadwal jadwal) throws Exception {
		// TODO Auto-generated method stub
		em.persist(jadwal);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean updateJadwal(Jadwal jadwal) throws Exception {
		// TODO Auto-generated method stub
		List<Jadwal> list = new ArrayList<>();
		Query q = em.createQuery("from Jadwal where id = :param");
		q.setParameter("param", jadwal.getId());
		list = q.getResultList();
		if (list.isEmpty()) {
			return false;
		} else {
			em.merge(jadwal);
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean deleteJadwal(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<Jadwal> list = new ArrayList<>();
		Query q = em.createQuery("from Jadwal where id = :param");
		q.setParameter("param", id);
		list = q.getResultList();
		if (list.isEmpty()) {
			return false;
		} else {
			em.remove(list.get(0));
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public User findByUsernameAndPassword(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		List<User> temp = new ArrayList<>();
		Query q = em.createQuery("from User where username = :param1 and password = :param2");
		q.setParameter("param1", username);
		q.setParameter("param2", password);
		temp = q.getResultList();
		return temp.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public JenisKendaraan findByIdJenisKendaraan(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<JenisKendaraan> list = new ArrayList<>();
		Query q = em.createQuery("from JenisKendaraan where id = :param");
		q.setParameter("param", id);
		list = q.getResultList();
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Voucher findByNamaVoucher(String namaVoucher) throws Exception {
		// TODO Auto-generated method stub
		List<Voucher> list = new ArrayList<>();
		Query q = em.createQuery("from Voucher where namaVoucher = :param");
		q.setParameter("param", namaVoucher);
		list = q.getResultList();
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Transportasi findByIdTranspostasi(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<Transportasi> list = new ArrayList<>();
		Query q = em.createQuery("from Transportasi where id = :param");
		q.setParameter("param", id);
		list = q.getResultList();
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Jadwal findByIdJadwal(Long id) {
		// TODO Auto-generated method stub
		List<Jadwal> list = new ArrayList<>();
		Query q = em.createQuery("from Jadwal where id = :param");
		q.setParameter("param", id);
		list = q.getResultList();
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
	
}
