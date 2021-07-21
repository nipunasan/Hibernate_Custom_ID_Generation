package com.ns.hibernateCustomIdGeneration.Sequence_Based_ID_Customize_At_Model_Class.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.lang.NonNull;

import com.ns.hibernateCustomIdGeneration.Sequence_Based_ID_Customize_At_Model_Class.generator.UserIdGenerator;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GenericGenerator(name = "usr_seq", strategy = "com.ns.hibernateCustomIdGeneration.Sequence_Based_ID_Customize_At_Model_Class.generator.UserIdGenerator", parameters = {
			@Parameter(name = UserIdGenerator.VALUE_PREFIX_PARAMETER, value = "USR"),
			@Parameter(name = UserIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%06d") })
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usr_seq")
	private String id;

	@Column(unique = true)
	@NonNull
	private String name;

	private String address;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
