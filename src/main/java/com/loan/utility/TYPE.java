package com.loan.utility;

public enum TYPE {

	STUDENT("0.00"), AUTO("500"), PERSONAL("750"), MONTGAGE("1500");

	private String rate;

	TYPE(String rate) {
		this.rate = rate;
	}

	public String getRate() {
		return rate;
	}


	
	

}
