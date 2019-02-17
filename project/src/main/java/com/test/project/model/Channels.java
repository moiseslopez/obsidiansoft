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

@Entity()
@Table(name = "CHANNELS", schema = "MLOPEZ")
public class Channels implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal channelId;
	@JsonIgnore
	private Person person;
	private String channelName;
	private Date creationDate;
	private BigDecimal numberOfMembers;

	public Channels() {
	}

	public Channels(BigDecimal channelId, Person person) {
		this.channelId = channelId;
		this.person = person;
	}

	public Channels(BigDecimal channelId, Person person, String channelName, Date creationDate, BigDecimal numberOfMembers) {
		this.channelId = channelId;
		this.person = person;
		this.channelName = channelName;
		this.creationDate = creationDate;
		this.numberOfMembers = numberOfMembers;
	}

	@Id

	@Column(name = "CHANNEL_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getChannelId() {
		return this.channelId;
	}

	public void setChannelId(BigDecimal channelId) {
		this.channelId = channelId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID", nullable = false)
	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Column(name = "CHANNEL_NAME", length = 100)
	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATION_DATE", length = 7)
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name = "NUMBER_OF_MEMBERS", precision = 10)
	public BigDecimal getNumberOfMembers() {
		return this.numberOfMembers;
	}

	public void setNumberOfMembers(BigDecimal numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}
}
