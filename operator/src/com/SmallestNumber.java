package com;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter youer number");
		int n=sc.nextInt();

		int smallest=9;
		while(n!=0) {
			int digit=n%10;

			if(digit<smallest) {
				smallest=digit;
			}
			n=n/10;
		}
		System.out.println("smallest number is "+smallest);



	}
}
