package com;

import java.util.Scanner;

public class PrimeOrNotWithDoWhile {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer Number");
		int n=sc.nextInt();
		
		int i=2;
		boolean flage=true;
		do {
			if(n%i==0) {
				flage=false;
			}
			i++;
		}while(i>n);
		
		if(flage==true)
		System.out.println("it is prime");
		
		else
		System.out.println("it is not a prime");
	}
}
