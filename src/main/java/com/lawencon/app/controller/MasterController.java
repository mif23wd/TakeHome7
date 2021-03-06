package com.lawencon.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.lawencon.app.model.Jadwal;
import com.lawencon.app.model.JenisKendaraan;
import com.lawencon.app.model.Transportasi;
import com.lawencon.app.model.User;
import com.lawencon.app.model.Voucher;
import com.lawencon.app.service.AppService;

@SuppressWarnings("rawtypes")
@RestController
public class MasterController extends BaseController {

	@Autowired
	AppService appservice;

	@SuppressWarnings("unchecked")
	@PostMapping("/master/jpa/insertuser")
	public ResponseEntity<?> insertUserJpa(@RequestHeader("Authorization") String auth, @RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			User u = (User) readValue(User.class, content);
			return new ResponseEntity<>(appservice.insertUserJpa(userpass[0], userpass[1], u), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/master/jpa/edituser")
	public ResponseEntity<?> editUserJpa(@RequestHeader("Authorization") String auth, @RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			User u = (User) readValue(User.class, content);
			return new ResponseEntity<>(appservice.editUserJpa(userpass[0], userpass[1], u), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/master/jpa/deleteuser")
	public ResponseEntity<?> deleteUserJpa(@RequestHeader("Authorization") String auth, @RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			User u = (User) readValue(User.class, content);
			return new ResponseEntity<>(appservice.deleteUserJpa(userpass[0], userpass[1], u.getId()), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@PostMapping("/master/jpa/insertjk")
	public ResponseEntity<?> insertJenisKendaraanJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			JenisKendaraan jk = (JenisKendaraan) readValue(JenisKendaraan.class, content);
			return new ResponseEntity<>(appservice.insertJenisKendaraanJpa(userpass[0], userpass[1], jk),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/master/jpa/editjk")
	public ResponseEntity<?> editJenisKendaraanJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			JenisKendaraan jk = (JenisKendaraan) readValue(JenisKendaraan.class, content);
			return new ResponseEntity<>(appservice.editJenisKendaraanJpa(userpass[0], userpass[1], jk), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/master/jpa/deletejk")
	public ResponseEntity<?> deleteJenisKendaraanJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			JenisKendaraan jk = (JenisKendaraan) readValue(JenisKendaraan.class, content);
			return new ResponseEntity<>(appservice.deleteJenisKendaraanJpa(userpass[0], userpass[1], jk.getId()),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/master/jpa/insertvoucher")
	public ResponseEntity<?> insertVoucherJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Voucher v = (Voucher) readValue(Voucher.class, content);
			return new ResponseEntity<>(appservice.insertVoucherJpa(userpass[0], userpass[1], v),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/master/jpa/editvoucher")
	public ResponseEntity<?> editVoucherJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Voucher v = (Voucher) readValue(Voucher.class, content);
			return new ResponseEntity<>(appservice.editVoucherJpa(userpass[0], userpass[1], v), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/master/jpa/deletevoucher")
	public ResponseEntity<?> deleteVoucherJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Voucher v = (Voucher) readValue(Voucher.class, content);
			return new ResponseEntity<>(appservice.deleteVoucherJpa(userpass[0], userpass[1], v.getId()),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/master/jpa/inserttransportasi")
	public ResponseEntity<?> insertTransportasiJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Transportasi trans = (Transportasi) readValue(Transportasi.class, content);
			return new ResponseEntity<>(appservice.insertTransportasiJpa(userpass[0], userpass[1], trans),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@PutMapping("/master/jpa/edittransportasi")
	public ResponseEntity<?> editTransportasiJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Transportasi transportasi = (Transportasi) readValue(Transportasi.class, content);
			return new ResponseEntity<>(appservice.editTransportasiJpa(userpass[0], userpass[1], transportasi), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/master/jpa/deletetransportasi")
	public ResponseEntity<?> deleteTransportasiJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Transportasi transportasi = (Transportasi) readValue(Transportasi.class, content);
			return new ResponseEntity<>(appservice.deleteTransportasiJpa(userpass[0], userpass[1], transportasi.getId()),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/master/jpa/insertjadwal")
	public ResponseEntity<?> insertJadwalJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Jadwal j = (Jadwal) readValue(Jadwal.class, content);
			return new ResponseEntity<>(appservice.insertJadwalJpa(userpass[0], userpass[1], j),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@PutMapping("/master/jpa/editjadwal")
	public ResponseEntity<?> editJadwalJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Jadwal j = (Jadwal) readValue(Jadwal.class, content);
			return new ResponseEntity<>(appservice.editJadwalJpa(userpass[0], userpass[1], j), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/master/jpa/deletejadwal")
	public ResponseEntity<?> deleteJadwalJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Jadwal j = (Jadwal) readValue(Jadwal.class, content);
			return new ResponseEntity<>(appservice.deleteJadwalJpa(userpass[0], userpass[1], j.getId()),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/master/hibernate/insertuser")
	public ResponseEntity<?> insertUserHibernate(@RequestHeader("Authorization") String auth, @RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			User u = (User) readValue(User.class, content);
			return new ResponseEntity<>(appservice.insertUserHibernate(userpass[0], userpass[1], u), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/master/hibernate/edituser")
	public ResponseEntity<?> editUserHibernate(@RequestHeader("Authorization") String auth, @RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			User u = (User) readValue(User.class, content);
			return new ResponseEntity<>(appservice.editUserHibernate(userpass[0], userpass[1], u), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/master/hibernate/deleteuser")
	public ResponseEntity<?> deleteUserHibernate(@RequestHeader("Authorization") String auth, @RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			User u = (User) readValue(User.class, content);
			return new ResponseEntity<>(appservice.deleteUserHibernate(userpass[0], userpass[1], u.getId()), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@PostMapping("/master/hibernate/insertjk")
	public ResponseEntity<?> insertJenisKendaraanHibernate(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			JenisKendaraan jk = (JenisKendaraan) readValue(JenisKendaraan.class, content);
			return new ResponseEntity<>(appservice.insertJenisKendaraanHibernate(userpass[0], userpass[1], jk),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/master/hibernate/editjk")
	public ResponseEntity<?> editJenisKendaraanHibernate(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			JenisKendaraan jk = (JenisKendaraan) readValue(JenisKendaraan.class, content);
			return new ResponseEntity<>(appservice.editJenisKendaraanHibernate(userpass[0], userpass[1], jk), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/master/hibernate/deletejk")
	public ResponseEntity<?> deleteJenisKendaraanHibernate(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			JenisKendaraan jk = (JenisKendaraan) readValue(JenisKendaraan.class, content);
			return new ResponseEntity<>(appservice.deleteJenisKendaraanHibernate(userpass[0], userpass[1], jk.getId()),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/master/hibernate/insertvoucher")
	public ResponseEntity<?> insertVoucherHibernate(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Voucher v = (Voucher) readValue(Voucher.class, content);
			return new ResponseEntity<>(appservice.insertVoucherHibernate(userpass[0], userpass[1], v),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/master/hibernate/editvoucher")
	public ResponseEntity<?> editVoucherHibernate(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Voucher v = (Voucher) readValue(Voucher.class, content);
			return new ResponseEntity<>(appservice.editVoucherHibernate(userpass[0], userpass[1], v), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/master/hibernate/deletevoucher")
	public ResponseEntity<?> deleteVoucherHibernate(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Voucher v = (Voucher) readValue(Voucher.class, content);
			return new ResponseEntity<>(appservice.deleteVoucherHibernate(userpass[0], userpass[1], v.getId()),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/master/hibernate/inserttransportasi")
	public ResponseEntity<?> insertTransportasiHibernate(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Transportasi trans = (Transportasi) readValue(Transportasi.class, content);
			return new ResponseEntity<>(appservice.insertTransportasiHibernate(userpass[0], userpass[1], trans),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@PutMapping("/master/hibernate/edittransportasi")
	public ResponseEntity<?> editTransportasiHibernate(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Transportasi trans = (Transportasi) readValue(Transportasi.class, content);
			return new ResponseEntity<>(appservice.editTransportasiHibernate(userpass[0], userpass[1], trans), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/master/hibernate/deletetransportasi")
	public ResponseEntity<?> deleteTransportasiHibernate(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Transportasi trans = (Transportasi) readValue(Transportasi.class, content);
			return new ResponseEntity<>(appservice.deleteTransportasiHibernate(userpass[0], userpass[1], trans.getId()),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/master/hibernate/insertjadwal")
	public ResponseEntity<?> insertJadwalHibernate(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Jadwal j = (Jadwal) readValue(Voucher.class, content);
			return new ResponseEntity<>(appservice.insertJadwalHibernate(userpass[0], userpass[1], j),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@PutMapping("/master/hibernate/editjadwal")
	public ResponseEntity<?> editJadwalHibernate(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Jadwal j = (Jadwal) readValue(Voucher.class, content);
			return new ResponseEntity<>(appservice.editJadwalHibernate(userpass[0], userpass[1], j), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/master/hibernate/deletejadwal")
	public ResponseEntity<?> deleteJadwalHibernate(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Jadwal j = (Jadwal) readValue(Voucher.class, content);
			return new ResponseEntity<>(appservice.deleteJadwalHibernate(userpass[0], userpass[1], j.getId()),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
}
