package com.ns.hibernateCustomIdGeneration.Sequence_Based_ID_Customize_At_Model_Class.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ns.hibernateCustomIdGeneration.Sequence_Based_ID_Customize_At_Model_Class.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
