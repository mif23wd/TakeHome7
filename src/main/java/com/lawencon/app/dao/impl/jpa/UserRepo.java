package com.lawencon.app.dao.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lawencon.app.model.User;

public interface UserRepo extends JpaRepository<User, Long>{
	public List<User> findByUsernameAndPassword(String username, String password);

	public List<User> findAllById(Long id);
}
