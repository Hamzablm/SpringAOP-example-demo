package com.example.dao;

import com.example.aspect.Loggable;
import com.example.domain.BankAccountDetails;
import org.springframework.stereotype.Component;

@Component
public class CustomerAccountDAO {

    @Loggable
    public void createBankAccount(BankAccountDetails bankAccountDetails) {
        // database operation
    }

    @Loggable
    public void subtractFromAccount(int bankAccountId, int amount) {
        // database operation
    }
}
