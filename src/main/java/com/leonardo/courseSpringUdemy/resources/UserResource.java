package com.leonardo.courseSpringUdemy.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.courseSpringUdemy.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Leonardo", "leovaz@gmail.com", "51974", "1234");
		return ResponseEntity.ok().body(u);
	}
	
}
