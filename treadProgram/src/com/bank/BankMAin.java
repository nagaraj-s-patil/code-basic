package com.bank;

public class BankMAin {

	public static void main(String[] args) {

		Bank sbi=new Bank();

		Customer c1=new Customer("sanket", sbi);
		Customer c2=new Customer("tom", sbi);

		c1.start();
		c2.start();
	}
}
