package com;

import java.util.Scanner;

public class PrimeOrNotMethod {  //called method

	static boolean  PrimeOrNot(int num) {

		for(int i=2;i<num;i++) {
			if(num%i==0) {

				return false;

			}
			
		}
		return true;
	}

public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter youer number");
	int n=sc.nextInt();



	boolean primeOrNot=PrimeOrNot(n);//calling method

	if(primeOrNot) {
		System.out.println("it is prime");
	}
	else
		System.out.println("it is not prime");


}
}
