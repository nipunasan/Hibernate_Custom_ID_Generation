package com.ns.hibernateCustomIdGeneration.Sequence_Based_ID.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ns.hibernateCustomIdGeneration.Sequence_Based_ID.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
