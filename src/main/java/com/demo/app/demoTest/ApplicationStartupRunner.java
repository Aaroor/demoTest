package com.demo.app.demoTest;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class ApplicationStartupRunner implements ApplicationRunner {
	@Autowired
	UserRepository userRepo;
	@Autowired
	PostRepository postRepo;
	@Autowired
	LocationRepository locationRepo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
//		Location l = locationRepo.findById(19L).get();
////		Location l = new Location();
////		l.setName("Colombo");
////		locationRepo.save(l);
//		User u = new User();
//		u.setName("LUser7");
//		u.setLocation(l);
//		userRepo.save(u);
//		System.out.println(locationRepo.findById(19L).get());
		//userRepo.deleteById(42L);
		//locationRepo.deleteById(40L);
		
				
		
	}

}
