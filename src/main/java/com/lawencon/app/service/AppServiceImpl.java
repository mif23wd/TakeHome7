package com.lawencon.app.service;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lawencon.app.dao.MasterDao;
import com.lawencon.app.dao.TransaksiDao;
import com.lawencon.app.model.Jadwal;
import com.lawencon.app.model.JenisKendaraan;
import com.lawencon.app.model.Transaksi;
import com.lawencon.app.model.TransaksiTiket;
import com.lawencon.app.model.Transportasi;
import com.lawencon.app.model.User;
import com.lawencon.app.model.Voucher;

@Service
public class AppServiceImpl implements AppService {

	@Autowired
	@Qualifier("master_jpa")
	MasterDao masterjpa;

	@Autowired
	@Qualifier("trx_jpa")
	TransaksiDao trxjpa;
	
	@Autowired
	@Qualifier("master_hibernate")
	MasterDao masterhibernate;
	
	@Autowired
	@Qualifier("trx_jpa")
	TransaksiDao trxhibernate;

	int tot = 0;
	String trxdetail = "";

	@Override
	public String insertUserJpa(String username, String password, User user) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			masterjpa.insertUser(user);
			notif = "data user telah dimasukan";
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String editUserJpa(String username, String password, User user) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			if (masterjpa.updateUser(user)) {
				return "data user telah diubah";
			} else {
				return "id user yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String deleteUserJpa(String username, String password, Long id) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			if (masterjpa.deleteUser(id)) {
				return "data user telah dihapus";
			} else {
				return "id user yang dimasukan tidak ada";
			}
		} else {
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
		} else {
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
			} else {
				return "id jenis kendaraan yang dimasukan tidak ada";
			}
		} else {
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
			} else {
				return "id jenis kendaraan yang dimasukan tidak ada";
			}
		} else {
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
		} else {
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
			} else {
				return "id voucher yang dimasukan tidak ada";
			}
		} else {
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
			} else {
				return "id voucher yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String insertTransportasiJpa(String username, String password, Transportasi transportasi) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			transportasi.setNoTransportasi(transportasi.getJenisKendaraan().getId().toString() + "-" + formatted);
			masterjpa.insertTransportasi(transportasi);
			notif = "data penyedia transportasi telah dimasukan";
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String editTransportasiJpa(String username, String password, Transportasi transportasi) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			if (masterjpa.updateTransportasi(transportasi)) {
				return "data penyedia transportasi telah diubah";
			} else {
				return "id penyedia transportasi yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String deleteTransportasiJpa(String username, String password, Long id) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			if (masterjpa.deleteTransportasi(id)) {
				return "data penyedia transportasi telah dihapus";
			} else {
				return "id penyedia transportasi yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String insertJadwalJpa(String username, String password, Jadwal jadwal) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			masterjpa.insertJadwal(jadwal);
			notif = "data jadwal keberangkatan telah dimasukan";
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String editJadwalJpa(String username, String password, Jadwal jadwal) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			if (masterjpa.updateJadwal(jadwal)) {
				return "data jadwal keberangkatan telah diubah";
			} else {
				return "id jadwal keberangkatan yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String deleteJadwalJpa(String username, String password, Long id) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterjpa.validation(username, password)) {
			if (masterjpa.deleteJadwal(id)) {
				return "data jadwal keberangkatan telah dihapus";
			} else {
				return "id jadwal keberangkatan yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String insertAndCetakStrukJpa(String username, String password, TransaksiTiket transaksiTiket)
			throws Exception {
		String notif;
		if (masterjpa.validation(username, password)) {
			SimpleDateFormat formatDate = new SimpleDateFormat("ddMMyyyy");
			Date date = new Date();
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatRandom = String.format("%05d", num);
			int num2 = random.nextInt(1000);
			String formatRandom2 = String.format("%03d", num2);
			User u = masterjpa.findByUsernameAndPassword(username, password);
			String trx_footer = "";
			notif = "===== Struk Pembelian Tiket ======\n";
			Voucher v = masterjpa.findByNamaVoucher(transaksiTiket.getTransaksi().getVoucher().getNamaVoucher());
			transaksiTiket.getTransaksi().setVoucher(v);
			transaksiTiket.getTransaksi().setUser(u);
			transaksiTiket.getTransaksi().setNoTransaksi("TRX" + formatDate.format(date) + formatRandom);
			trxjpa.insertTransaksi(transaksiTiket.getTransaksi());
			Transaksi transaksi = trxjpa.findByNoTransaksi(transaksiTiket.getTransaksi().getNoTransaksi());
			String trxhead = "No. Transaksi\t: " + transaksi.getNoTransaksi() + "\nNama Pembeli\t: "
					+ transaksi.getUser().getNamaUser()
					+ "\n==================================\n          Detail Tiket\n==================================\n";
			transaksiTiket.getListTiket().forEach(val -> {
				val.setTransaksi(transaksi);
				val.setNoTik("TIK-" + formatRandom2 + "-" + val.getNoBangku());
				Transportasi tr;
				Jadwal jd;
				JenisKendaraan jk1;
				try {
					tr = masterjpa.findByIdTranspostasi(val.getTransportasi().getId());
					jd = masterjpa.findByIdJadwal(val.getJadwal().getId());
					jk1 = masterjpa.findByIdJenisKendaraan(tr.getJenisKendaraan().getId());
					tot += tr.getHarga();
					trxdetail += "No. Kursi\t: " + val.getNoBangku() + "\nNama\t\t: " + val.getNamaPenumpang()
							+ "\nPenyedia\t: " + tr.getNamaLayanan() + "\nKendaraan\t: " + jk1.getNamaKendaraan()
							+ "\nJadwal\t\t: " + jd.getWaktu() + "\nHarga\t\t: Rp." + tr.getHarga()
							+ "\n----------------------------------\n";
					trxjpa.insertTiket(val);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});

			if (transaksi.getVoucher() != null) {
				Voucher v1 = masterjpa.findByNamaVoucher(transaksi.getVoucher().getNamaVoucher());
				tot = (int) (tot - (tot * v1.getPotongan()));
				trx_footer += "\nPotongan\t: " + (int) (v1.getPotongan() * 100) + "%\n";
			}
			trx_footer += "Total Bayar\t: Rp." + tot + "\n==================================\n";
			transaksi.setTotalBayar(tot);
			trxjpa.editTransaksi(transaksi);
			notif += trxhead + trxdetail + trx_footer;
			tot = 0;
			trxdetail = "";
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String insertUserHibernate(String username, String password, User user) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			masterhibernate.insertUser(user);
			notif = "data user telah dimasukan";
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String editUserHibernate(String username, String password, User user) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			if (masterhibernate.updateUser(user)) {
				return "data user telah diubah";
			} else {
				return "id user yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String deleteUserHibernate(String username, String password, Long id) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			if (masterhibernate.deleteUser(id)) {
				return "data user telah dihapus";
			} else {
				return "id user yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String insertJenisKendaraanHibernate(String username, String password, JenisKendaraan jenisKendaraan)
			throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			masterhibernate.insertJenisKendaraan(jenisKendaraan);
			notif = "data jenis kendaraan telah dimasukan";
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String editJenisKendaraanHibernate(String username, String password, JenisKendaraan jenisKendaraan)
			throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			if (masterhibernate.updateJenisKendaraan(jenisKendaraan)) {
				return "data jenis telah diubah";
			} else {
				return "id jenis kendaraan yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String deleteJenisKendaraanHibernate(String username, String password, Long Id) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			if (masterhibernate.deleteJenisKendaraan(Id)) {
				return "data jenis kendaraan telah dihapus";
			} else {
				return "id jenis kendaraan yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String insertVoucherHibernate(String username, String password, Voucher voucher) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			masterhibernate.insertVoucher(voucher);
			notif = "data voucher telah dimasukan";
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String editVoucherHibernate(String username, String password, Voucher voucher) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			if (masterhibernate.updateVoucher(voucher)) {
				return "data voucher telah diubah";
			} else {
				return "id voucher yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String deleteVoucherHibernate(String username, String password, Long id) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			if (masterhibernate.deleteVoucher(id)) {
				return "data voucher telah dihapus";
			} else {
				return "id voucher yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String insertTransportasiHibernate(String username, String password, Transportasi transportasi) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			transportasi.setNoTransportasi(transportasi.getJenisKendaraan().getId().toString() + "-" + formatted);
			masterhibernate.insertTransportasi(transportasi);
			notif = "data penyedia transportasi telah dimasukan";
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String editTransportasiHibernate(String username, String password, Transportasi transportasi) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			if (masterhibernate.updateTransportasi(transportasi)) {
				return "data penyedia transportasi telah diubah";
			} else {
				return "id penyedia transportasi yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String deleteTransportasiHibernate(String username, String password, Long id) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			if (masterhibernate.deleteTransportasi(id)) {
				return "data penyedia transportasi telah dihapus";
			} else {
				return "id penyedia transportasi yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String insertJadwalHibernate(String username, String password, Jadwal jadwal) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			masterhibernate.insertJadwal(jadwal);
			notif = "data jadwal keberangkatan telah dimasukan";
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String editJadwalHibernate(String username, String password, Jadwal jadwal) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			if (masterhibernate.updateJadwal(jadwal)) {
				return "data jadwal keberangkatan telah diubah";
			} else {
				return "id jadwal keberangkatan yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String deleteJadwalHibernate(String username, String password, Long id) throws Exception {
		// TODO Auto-generated method stub
		String notif;
		if (masterhibernate.validation(username, password)) {
			if (masterhibernate.deleteJadwal(id)) {
				return "data jadwal keberangkatan telah dihapus";
			} else {
				return "id jadwal keberangkatan yang dimasukan tidak ada";
			}
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

	@Override
	public String insertAndCetakStrukHibernate(String username, String password, TransaksiTiket transaksiTiket)
			throws Exception {
		String notif;
		if (masterhibernate.validation(username, password)) {
			SimpleDateFormat formatDate = new SimpleDateFormat("ddMMyyyy");
			Date date = new Date();
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatRandom = String.format("%05d", num);
			int num2 = random.nextInt(1000);
			String formatRandom2 = String.format("%03d", num2);
			User u = masterhibernate.findByUsernameAndPassword(username, password);
			String trx_footer = "";
			notif = "===== Struk Pembelian Tiket ======\n";
			Voucher v = masterhibernate.findByNamaVoucher(transaksiTiket.getTransaksi().getVoucher().getNamaVoucher());
			transaksiTiket.getTransaksi().setVoucher(v);
			transaksiTiket.getTransaksi().setUser(u);
			transaksiTiket.getTransaksi().setNoTransaksi("TRX" + formatDate.format(date) + formatRandom);
			trxhibernate.insertTransaksi(transaksiTiket.getTransaksi());
			Transaksi transaksi = trxhibernate.findByNoTransaksi(transaksiTiket.getTransaksi().getNoTransaksi());
			String trxhead = "No. Transaksi\t: " + transaksi.getNoTransaksi() + "\nNama Pembeli\t: "
					+ transaksi.getUser().getNamaUser()
					+ "\n==================================\n          Detail Tiket\n==================================\n";
			transaksiTiket.getListTiket().forEach(val -> {
				val.setTransaksi(transaksi);
				val.setNoTik("TIK-" + formatRandom2 + "-" + val.getNoBangku());
				Transportasi tr;
				Jadwal jd;
				JenisKendaraan jk1;
				try {
					tr = masterhibernate.findByIdTranspostasi(val.getTransportasi().getId());
					jd = masterhibernate.findByIdJadwal(val.getJadwal().getId());
					jk1 = masterhibernate.findByIdJenisKendaraan(tr.getJenisKendaraan().getId());
					tot += tr.getHarga();
					trxdetail += "No. Kursi\t: " + val.getNoBangku() + "\nNama\t\t: " + val.getNamaPenumpang()
							+ "\nPenyedia\t: " + tr.getNamaLayanan() + "\nKendaraan\t: " + jk1.getNamaKendaraan()
							+ "\nJadwal\t\t: " + jd.getWaktu() + "\nHarga\t\t: Rp." + tr.getHarga()
							+ "\n----------------------------------\n";
					trxhibernate.insertTiket(val);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});

			if (transaksi.getVoucher() != null) {
				Voucher v1 = masterhibernate.findByNamaVoucher(transaksi.getVoucher().getNamaVoucher());
				tot = (int) (tot - (tot * v1.getPotongan()));
				trx_footer += "\nPotongan\t: " + (int) (v1.getPotongan() * 100) + "%\n";
			}
			trx_footer += "Total Bayar\t: Rp." + tot + "\n==================================\n";
			transaksi.setTotalBayar(tot);
			trxhibernate.editTransaksi(transaksi);
			notif += trxhead + trxdetail + trx_footer;
			tot = 0;
			trxdetail = "";
		} else {
			notif = "username & password salah";
		}
		return notif;
	}

}
