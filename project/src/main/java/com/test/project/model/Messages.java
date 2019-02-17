package com.test.project.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "MESSAGES", schema = "MLOPEZ")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Messages implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal messageId;
	@JsonIgnore
	private Person person;
	private String message;
	private Date creationDate;

	public Messages() {
	}

	public Messages(BigDecimal messageId, Person person) {
		this.messageId = messageId;
		this.person = person;
	}

	public Messages(BigDecimal messageId, Person person, String message, Date creationDate) {
		this.messageId = messageId;
		this.person = person;
		this.message = message;
		this.creationDate = creationDate;
	}

	@Id

	@Column(name = "MESSAGE_ID", unique = true, nullable = false, precision = 10)
	public BigDecimal getMessageId() {
		return this.messageId;
	}

	public void setMessageId(BigDecimal messageId) {
		this.messageId = messageId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID", nullable = false)
	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Column(name = "MESSAGE")
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATION_DATE", length = 7)
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
