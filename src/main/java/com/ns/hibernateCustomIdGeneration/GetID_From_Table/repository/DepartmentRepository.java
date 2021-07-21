package com.ns.hibernateCustomIdGeneration.GetID_From_Table.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ns.hibernateCustomIdGeneration.GetID_From_Table.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDeptName(String deptName);
}
