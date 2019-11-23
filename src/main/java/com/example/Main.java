package com.example;

import com.example.dao.CustomerAccountDAO;
import com.example.domain.BankAccountDetails;
import config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CustomerAccountDAO customerAccountDAO = context.getBean(CustomerAccountDAO.class);

        customerAccountDAO.createBankAccount(new BankAccountDetails(10, 20_000));
        customerAccountDAO.subtractFromAccount(10, 1_000);

    }

}
