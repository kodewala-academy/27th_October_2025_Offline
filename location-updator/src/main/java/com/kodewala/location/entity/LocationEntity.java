package com.kodewala.location.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "user_location")
public class LocationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String user;
	@Transient
	private String deviceID;
	private String lt;
	private String lg;

	public long getId() {
		return id;
	}

	public String getUser() {
		return user;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public String getLt() {
		return lt;
	}

	public String getLg() {
		return lg;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public void setLt(String lt) {
		this.lt = lt;
	}

	public void setLg(String lg) {
		this.lg = lg;
	}

}
