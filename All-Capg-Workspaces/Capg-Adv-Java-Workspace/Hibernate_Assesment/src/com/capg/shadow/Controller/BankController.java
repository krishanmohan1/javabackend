package com.capg.shadow.Controller;
import java.util.*;


public class BankController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		sc.nextLine();
			do {
			System.out.println("1.Create a New Account");
			System.out.println("2.Show Account Balance");
			System.out.println("3.Deposit Money");
			System.out.println("4.Withdraw Money");
			System.out.println("5.Fund Transfer");
			System.out.println("6.Print Transsaction");
			System.out.println("Enter your choice : ");
			}while(ch!=0);
			
			switch(ch) {
				case 1:{
					System.out.println("Enter AccountNumber : ");
					int accountNumber = sc.nextInt();
					System.out.println("Enter the Customer Name: ");
					String customerName = sc.nextLine();
					System.out.println("Enter the mobile: ");
					long mobileNumber = sc.nextLong();
					System.out.println("Enter the Balance: ");
					double balance = sc.nextDouble();
					
					int k = bankService.createAccount(accountNumber,customerName,mobileNumber,balance);
					
		
					
				}
				
			}
		
	}

}
