package com.loan.repository;
import org.springframework.data.repository.CrudRepository;

import com.loan.model.Loans;
public interface LoansRepository extends CrudRepository<Loans, Integer>
{
}
