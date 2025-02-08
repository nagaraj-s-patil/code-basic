package com.bank;

public class Bank {

	synchronized void withdrow(String name) {
		System.out.println(name+" withdrowing money");

		try 
		{
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" has finished withdrowing money");
		System.out.println("--------------------------");
	}
}
