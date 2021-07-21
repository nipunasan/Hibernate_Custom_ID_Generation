package com.ns.hibernateCustomIdGeneration.Sequence_Based_ID_Customize_At_Model_Class.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ns.hibernateCustomIdGeneration.Sequence_Based_ID_Customize_At_Model_Class.model.User;
import com.ns.hibernateCustomIdGeneration.Sequence_Based_ID_Customize_At_Model_Class.repository.UserRepository;

@RestController
@RequestMapping("/sequenceUser")
public class UserResource {

	@Autowired
	private UserRepository userRepo;

	@GetMapping
	public User getSequence() {
		User comp = new User();
		comp.setName("Nipuna : " + Math.random());
		comp.setAddress("User Address : " + Math.random());
		return userRepo.save(comp);
	}

}
