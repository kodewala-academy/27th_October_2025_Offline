package com.kodewala.location.controller.request;

public class LocationRequest {

	private String user;
	private String deviceID;
	private String lt;
	private String lg;

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
