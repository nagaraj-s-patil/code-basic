package com.bank;

public class Customer extends Thread{

	//Has-A
	Bank bank;
	String name;

	Customer (String name,Bank bank){
		this.name=name;
		this.bank=bank;
	}

	@Override
	public void run() {
		bank.withdrow(this.name);
	}
}
