package com.demo.app.demoTest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
	List<User> findByLocationId(String id);
	
}
