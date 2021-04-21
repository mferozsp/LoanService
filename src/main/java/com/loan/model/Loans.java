package com.loan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

//marked class as an Entity
@Entity
//defined class name as Table
@Table
public class Loans {
//Defined book id as primary key
	@Id
	@Column
	@NonNull
	private int SSN;
	@Column
	private String DOB;
	@Column
	@NonNull
	private Long loanAmount;
	@Column
	@NonNull
	private double rate;
	@Column
	@NonNull
	private String type;
	@Column
	@NonNull
	private int term;
	@Column
	private Double APR;

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public Long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public Double getAPR() {
		return APR;
	}

	public void setAPR(Double aPR) {
		APR = aPR;
	}

}