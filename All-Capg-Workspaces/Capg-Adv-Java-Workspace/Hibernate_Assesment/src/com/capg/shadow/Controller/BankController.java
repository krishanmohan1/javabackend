package com.capg.shadow.Controller;

import java.util.Scanner;

import com.capg.shadow.Service.BankService;

public class BankController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService bankService = new BankService();

        while (true) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1.Create a New Account");
            System.out.println("2.Show Account Balance");
            System.out.println("3.Deposit Money");
            System.out.println("4.Withdraw Money");
            System.out.println("5.Fund Transfer");
            System.out.println("6.Exit");
            System.out.print("Enter your choice : ");

            int ch = sc.nextInt();

            switch (ch) {

            case 1:

                System.out.print("Enter Account Number : ");
                int accountNumber = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Customer Name : ");
                String customerName = sc.nextLine();

                System.out.print("Enter Mobile Number : ");
                long mobileNumber = sc.nextLong();

                System.out.print("Enter Balance : ");
                double balance = sc.nextDouble();

                int k = bankService.createAccount(accountNumber, customerName, mobileNumber, balance);

                if (k == 1)
                    System.out.println("Account Created Successfully");
                else
                    System.out.println("Account Creation Failed");

                break;

            case 2:

                System.out.print("Enter Account Number : ");
                int balAcc = sc.nextInt();

                bankService.showBalance(balAcc);

                break;

            case 3:

                System.out.print("Enter Account Number : ");
                int dAcc = sc.nextInt();

                System.out.print("Enter Amount : ");
                double dAmt = sc.nextDouble();

                bankService.deposit(dAcc, dAmt);

                break;

            case 4:

                System.out.print("Enter Account Number : ");
                int wAcc = sc.nextInt();

                System.out.print("Enter Amount : ");
                double wAmt = sc.nextDouble();

                bankService.withdraw(wAcc, wAmt);

                break;

            case 5:

                System.out.print("Enter Sender Account : ");
                int from = sc.nextInt();

                System.out.print("Enter Receiver Account : ");
                int to = sc.nextInt();

                System.out.print("Enter Amount : ");
                double amt = sc.nextDouble();

                bankService.fundTransfer(from, to, amt);

                break;

            case 6:

                System.out.println("Thank you!");
                sc.close();
                System.exit(0);
                break;

            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}
