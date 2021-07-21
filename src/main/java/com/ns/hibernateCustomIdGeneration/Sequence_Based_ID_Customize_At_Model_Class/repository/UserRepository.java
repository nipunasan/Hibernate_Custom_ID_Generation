package com.ns.hibernateCustomIdGeneration.Sequence_Based_ID_Customize_At_Model_Class.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ns.hibernateCustomIdGeneration.Sequence_Based_ID_Customize_At_Model_Class.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
