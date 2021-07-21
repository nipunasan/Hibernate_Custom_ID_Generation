package com.ns.hibernateCustomIdGeneration.GetID_From_Table.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.sun.istack.NotNull;

@Entity
public class Department {

	@Id
	@GenericGenerator(name = "sequence_dep_id", strategy = "com.ns.hibernateCustomIdGeneration.GetID_From_Table.generator.DepartmentIdGenerator")
	@GeneratedValue(generator = "sequence_dep_id")
	@Column(name = "Department_Id")
	private String deptId;

	@Column(name = "Department_Name", unique = true, nullable = false)
	private String deptName;

	@Column(name = "Department_Description")
	@NotNull
	private String deptDesc;

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptDesc() {
		return deptDesc;
	}

	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}

}