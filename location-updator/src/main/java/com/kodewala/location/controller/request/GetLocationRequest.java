package com.kodewala.location.controller.request;

public class GetLocationRequest {

	private int page;
	private int record;

	public int getPage() {
		return page;
	}

	public int getRecord() {
		return record;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setRecord(int record) {
		this.record = record;
	}

}
