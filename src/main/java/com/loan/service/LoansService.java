package com.loan.service;

import java.util.List;

import com.loan.model.Loans;

public interface LoansService {
	public List<Loans> getAllLoans();
	public Loans createLoan(Loans loans);

}
