package com.capg.shadow.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.capg.shadow.Bean.BankBean;

public class BankDAO {

    private SessionFactory factory = BankConnectionDAO.getFactory();

    public int createAccount(BankBean bank) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(bank);

        tx.commit();
        session.close();

        return 1;
    }

    public BankBean getAccount(int accountNumber) {

        Session session = factory.openSession();

        BankBean bank = session.get(BankBean.class, accountNumber);

        session.close();

        return bank;
    }

    public boolean deposit(int accountNumber, double amount) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        BankBean bank = session.get(BankBean.class, accountNumber);

        if (bank == null) {
            session.close();
            return false;
        }

        bank.setBalance(bank.getBalance() + amount);

        tx.commit();
        session.close();

        return true;
    }

    public boolean withdraw(int accountNumber, double amount) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        BankBean bank = session.get(BankBean.class, accountNumber);

        if (bank == null || bank.getBalance() < amount) {
            session.close();
            return false;
        }

        bank.setBalance(bank.getBalance() - amount);

        tx.commit();
        session.close();

        return true;
    }

    public boolean fundTransfer(int fromAcc, int toAcc, double amount) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        BankBean sender = session.get(BankBean.class, fromAcc);
        BankBean receiver = session.get(BankBean.class, toAcc);

        if (sender == null || receiver == null || sender.getBalance() < amount) {
            session.close();
            return false;
        }

        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        tx.commit();
        session.close();

        return true;
    }
}
