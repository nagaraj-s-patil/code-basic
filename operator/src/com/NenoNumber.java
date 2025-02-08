package com;

import java.util.*;
public class NenoNumber {

	public static void main(String[] args) {

		System.out.println("Enter youer number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int squer=n*n;
		int sum=0;
		while(squer>0) {

			int digit=squer%10;
			sum+=digit;
			squer=squer/10;

		}
		if(sum==n) {
			System.out.println("this is Nenon Number");
		}
		else
			System.out.println("this is not a Nenon Number");

		sc.close();
	}

}
