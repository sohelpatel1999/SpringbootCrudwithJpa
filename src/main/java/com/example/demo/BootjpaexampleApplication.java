package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.UserRepository;
import com.example.demo.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userrepositor = context.getBean(UserRepository.class);
		
		//
		
		User user = new User();
		user.setName("Sagar");
		user.setCity("Pune");
		user.setStatus("On call");
		User user1 = userrepositor.save(user);
		System.out.println(user1);
		
//		// update the data
//		Optional<User> optional =  userrepositor.findById(2);
//		User update = optional.get();
//		update.setName("Mutallib");
//		User update1 = userrepositor.save(update);
//		System.out.println(update1);
		
//		//retiriving the data
//		Iterable<User> retrive =  userrepositor.findAll();
//		for (User user : retrive) {
//			System.out.println(user);
//		}
//	
		
//		//delete the data
//		userrepositor.deleteById(2);
//		System.out.println("Deleted Sucessfully");
		
		
	}

}
