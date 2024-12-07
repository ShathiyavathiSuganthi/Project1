package org.tcs;

import java.util.Scanner;
class BankManagement{
	private String acname;
	private String acno;
	private double balance;
	public BankManagement(String acname,String acno) {
		this.acname=acname;
		this.acno=acno;
		this.balance=0.0;
	}
	public String getacname() {
		return acname;
	}
	public String getacno() {
		return acno;
	}
	public double getbalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Deposit successfully....");
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && balance>amount) {
			balance=balance-amount;
			System.out.println("Amount withdraw");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
}
public class Bank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account Holder Name:");
		String acname=sc.nextLine();
		System.out.println("Enter the Account Number:");
		String acno=sc.nextLine();
		BankManagement b=new BankManagement(acno, acname);
		while(true) {
			System.out.println("Banking Management System");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
			System.out.println("4. Exit");
		int c=sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("Your Current Balanace is:"+b.getbalance());
			break;
		case 2:
			System.out.println("Enter The Amount to be Deposit:");
			double da=sc.nextDouble();
			b.deposit(da);
			break;
		case 3:
			System.out.println("Enter the Amount to be Withdraw:");
			double wa=sc.nextDouble();
			b.withdraw(wa);
			break;
		case 4:
			System.out.println("Thank You Visit Again");
			
			sc.close();
			System.exit(0);
			
        default:
        	System.out.println("Invalid choices");
			
		}
		
	}

}
}
