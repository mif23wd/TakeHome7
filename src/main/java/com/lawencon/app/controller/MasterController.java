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
import com.lawencon.app.model.JenisKendaraan;
import com.lawencon.app.model.User;
import com.lawencon.app.model.Voucher;
import com.lawencon.app.service.AppService;

@RestController
public class MasterController extends BaseController {

	@Autowired
	AppService appservice;

	@PostMapping("/master/jpa/tambahuser")
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

	@PostMapping("/master/jpa/tambahjk")
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
	
	@PostMapping("/master/jpa/tambahvoucher")
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
}
