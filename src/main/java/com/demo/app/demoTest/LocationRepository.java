package com.demo.app.demoTest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationRepository extends JpaRepository<Location,Long> {
	
}
