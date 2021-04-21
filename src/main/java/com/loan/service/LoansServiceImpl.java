package com.loan.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.model.Loans;
import com.loan.repository.LoansRepository;
import com.loan.utility.TYPE;

//defined the business logic
@Service
public class LoansServiceImpl implements LoansService {
	@Autowired
	private LoansRepository loansRepository;

//getting all books record by using the method find All() of CrudRepository
	public List<Loans> getAllLoans() {
		List<Loans> loans = new ArrayList<Loans>();
		loansRepository.findAll().forEach(loans1 -> loans.add(loans1));
		return loans;
	}

//saving a specific record by using the method save() of CrudRepository
	public Loans createLoan(Loans loans) {
		double interest = (loans.getLoanAmount() * loans.getRate() * loans.getTerm()) / 100;
		double fees = Double.parseDouble(Arrays.stream(TYPE.values())
				.filter(val1 -> val1.name().equalsIgnoreCase("student")).findFirst().get().getRate());
		loans.setAPR(((((fees + interest) / loans.getLoanAmount()) / loans.getTerm()) * 365) * 100);

		loansRepository.save(loans);

		return loans;
	}

}