package com.test.project.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "PERSON", schema = "MLOPEZ")
@JsonIgnoreProperties
public class Person implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal userId;
	private String name;
	private String lastName;
	private String email;
	private String password;
	private BigDecimal friendOf;

	public Person() {
	}

	public Person(BigDecimal userId) {
		this.userId = userId;
	}

	public Person(BigDecimal userId, String name, String lastName, String email, String password, BigDecimal friendOf) {
		this.userId = userId;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.friendOf = friendOf;
	}

	@Id

	@Column(name = "USER_ID", unique = true, nullable = false, precision = 10)
	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "LAST_NAME", length = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "EMAIL", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PASSWORD", length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "FRIEND_OF", precision = 22, scale = 0)
	public BigDecimal getFriendOf() {
		return this.friendOf;
	}

	public void setFriendOf(BigDecimal friendOf) {
		this.friendOf = friendOf;
	}

}
