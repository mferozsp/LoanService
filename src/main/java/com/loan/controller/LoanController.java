package com.loan.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.model.Loans;
import com.loan.service.LoansService;

//marked class as Controller
@RestController
public class LoanController {
//autowired the LoansService class
	@Autowired
	private LoansService loanService;

//created a get mapping that retrieves all the loan details from the database
	@GetMapping("/loans")
	private List<Loans> getAllLoans() {
		return loanService.getAllLoans();
	}

//created post mapping that posts the loan detail in the database
	@PostMapping("/saveLoan")
	private Loans createLoan(@Valid @RequestBody Loans loans) {
		Loans createdLoan= loanService.createLoan(loans);
		return createdLoan;
	}

}
