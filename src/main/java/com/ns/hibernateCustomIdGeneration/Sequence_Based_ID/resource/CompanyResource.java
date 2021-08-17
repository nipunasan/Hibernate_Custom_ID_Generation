package com.ns.hibernateCustomIdGeneration.Sequence_Based_ID.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ns.hibernateCustomIdGeneration.Sequence_Based_ID.model.Company;
import com.ns.hibernateCustomIdGeneration.Sequence_Based_ID.repository.CompanyRepository;

@RestController
@RequestMapping("/sequenceCompany")
public class CompanyResource {

	@Autowired
	private CompanyRepository compRepo;

	@GetMapping
	public Company getSequence() {
		Company comp = new Company();
		comp.setName("Nipuna (Pvt) Ltd : " + Math.random());
		comp.setAddress("Product Address : " + Math.random());
		return compRepo.save(comp);
	}

}
