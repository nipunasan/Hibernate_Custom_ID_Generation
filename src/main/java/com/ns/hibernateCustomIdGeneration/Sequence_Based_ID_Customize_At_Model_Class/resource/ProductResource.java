package com.ns.hibernateCustomIdGeneration.Sequence_Based_ID_Customize_At_Model_Class.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ns.hibernateCustomIdGeneration.Sequence_Based_ID_Customize_At_Model_Class.model.Product;
import com.ns.hibernateCustomIdGeneration.Sequence_Based_ID_Customize_At_Model_Class.repository.ProductRepository;

@RestController
@RequestMapping("/sequenceProduct")
public class ProductResource {

	@Autowired
	ProductRepository productRepo;

	@GetMapping
	public Product getSequence() {
		Product prod = new Product();
		prod.setName("Vehicle : " + Math.random());
		return productRepo.save(prod);
	}

}
