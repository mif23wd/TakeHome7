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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lawencon.app.model.Jadwal;
import com.lawencon.app.model.JenisKendaraan;
import com.lawencon.app.model.Transportasi;
import com.lawencon.app.model.User;
import com.lawencon.app.model.Voucher;
import com.lawencon.app.service.AppService;

@RestController
public class MasterController extends BaseController {

	@Autowired
	AppService appservice;

	@PostMapping("/master/jpa/insertuser")
	public ResponseEntity<?> insertUserJpa(@RequestHeader("Authorization") String auth, @RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			User u = new ObjectMapper().readValue(content, User.class);
			return new ResponseEntity<>(appservice.insertUserJpa(userpass[0], userpass[1], u), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/master/jpa/edituser")
	public ResponseEntity<?> editUserJpa(@RequestHeader("Authorization") String auth, @RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			User u = new ObjectMapper().readValue(content, User.class);
			return new ResponseEntity<>(appservice.editUserJpa(userpass[0], userpass[1], u), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/master/jpa/deleteuser")
	public ResponseEntity<?> deleteUserJpa(@RequestHeader("Authorization") String auth, @RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			User u = new ObjectMapper().readValue(content, User.class);
			return new ResponseEntity<>(appservice.deleteUserJpa(userpass[0], userpass[1], u.getId()), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/master/jpa/insertjk")
	public ResponseEntity<?> insertJenisKendaraanJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			JenisKendaraan jk = new ObjectMapper().readValue(content, JenisKendaraan.class);
			return new ResponseEntity<>(appservice.insertJenisKendaraanJpa(userpass[0], userpass[1], jk),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/master/jpa/editjk")
	public ResponseEntity<?> editJenisKendaraanJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			JenisKendaraan jk = new ObjectMapper().readValue(content, JenisKendaraan.class);
			return new ResponseEntity<>(appservice.editJenisKendaraanJpa(userpass[0], userpass[1], jk), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/master/jpa/deletejk")
	public ResponseEntity<?> deleteJenisKendaraanJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			JenisKendaraan jk = new ObjectMapper().readValue(content, JenisKendaraan.class);
			return new ResponseEntity<>(appservice.deleteJenisKendaraanJpa(userpass[0], userpass[1], jk.getId()),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/master/jpa/insertvoucher")
	public ResponseEntity<?> insertVoucherJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Voucher v = new ObjectMapper().readValue(content, Voucher.class);
			return new ResponseEntity<>(appservice.insertVoucherJpa(userpass[0], userpass[1], v),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/master/jpa/editvoucher")
	public ResponseEntity<?> editVoucherJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Voucher v = new ObjectMapper().readValue(content, Voucher.class);
			return new ResponseEntity<>(appservice.editVoucherJpa(userpass[0], userpass[1], v), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/master/jpa/deletevoucher")
	public ResponseEntity<?> deleteVoucherJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Voucher v = new ObjectMapper().readValue(content, Voucher.class);
			return new ResponseEntity<>(appservice.deleteVoucherJpa(userpass[0], userpass[1], v.getId()),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/master/jpa/inserttransportasi")
	public ResponseEntity<?> insertTransportasiJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Transportasi trans = new ObjectMapper().readValue(content, Transportasi.class);
			return new ResponseEntity<>(appservice.insertTransportasiJpa(userpass[0], userpass[1], trans),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/master/jpa/edittransportasi")
	public ResponseEntity<?> editTransportasiJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Transportasi transportasi  = new ObjectMapper().readValue(content, Transportasi.class);
			return new ResponseEntity<>(appservice.editTransportasiJpa(userpass[0], userpass[1], transportasi), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/master/jpa/deletetransportasi")
	public ResponseEntity<?> deleteTransportasiJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Transportasi transportasi = new ObjectMapper().readValue(content, Transportasi.class);
			return new ResponseEntity<>(appservice.deleteTransportasiJpa(userpass[0], userpass[1], transportasi.getId()),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/master/jpa/insertjadwal")
	public ResponseEntity<?> insertJadwalJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Jadwal j = new ObjectMapper().readValue(content, Jadwal.class);
			return new ResponseEntity<>(appservice.insertJadwalJpa(userpass[0], userpass[1], j),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/master/jpa/editjadwal")
	public ResponseEntity<?> editJadwalJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Jadwal jadwal  = new ObjectMapper().readValue(content, Jadwal.class);
			return new ResponseEntity<>(appservice.editJadwalJpa(userpass[0], userpass[1], jadwal), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/master/jpa/deletejadwal")
	public ResponseEntity<?> deleteJadwalJpa(@RequestHeader("Authorization") String auth,
			@RequestBody String content) {
		try {
			String[] userpass = authUser(auth);
			Jadwal jadwal = new ObjectMapper().readValue(content, Jadwal.class);
			return new ResponseEntity<>(appservice.deleteJadwalJpa(userpass[0], userpass[1], jadwal.getId()),
					HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>("ada yang salah", HttpStatus.BAD_REQUEST);
		}
	}
}
