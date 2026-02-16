package com.capg.shadow.Service;

import com.capg.shadow.Bean.BankBean;
import com.capg.shadow.DAO.BankDAO;

public class BankService {

    private BankDAO dao = new BankDAO();

    public int createAccount(int accountNumber, String customerName, long mobileNumber, double balance) {

        BankBean bank = new BankBean();
        bank.setAccountNumber(accountNumber);
        bank.setCustomerName(customerName);
        bank.setMobileNumber(mobileNumber);
        bank.setBalance(balance);

        return dao.createAccount(bank);
    }

    public void showBalance(int accountNumber) {

        BankBean bank = dao.getAccount(accountNumber);

        if (bank == null) {
            System.out.println("Account Not Found");
            return;
        }

        System.out.println("Name : " + bank.getCustomerName());
        System.out.println("Balance : " + bank.getBalance());
    }

    public void deposit(int accountNumber, double amount) {

        if (dao.deposit(accountNumber, amount))
            System.out.println("Deposit Successful");
        else
            System.out.println("Account Not Found");
    }

    public void withdraw(int accountNumber, double amount) {

        if (dao.withdraw(accountNumber, amount))
            System.out.println("Withdraw Successful");
        else
            System.out.println("Account Not Found / Insufficient Balance");
    }

    public void fundTransfer(int fromAcc, int toAcc, double amount) {

        if (dao.fundTransfer(fromAcc, toAcc, amount))
            System.out.println("Transfer Successful");
        else
            System.out.println("Transfer Failed");
    }
}
