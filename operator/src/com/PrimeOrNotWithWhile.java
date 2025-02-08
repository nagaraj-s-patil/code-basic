package com;

import java.util.*;
public class PrimeOrNotWithWhile {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer Number");
		int n=sc.nextInt();

		int i=2;
		boolean flag =true;
		while(n>i && n>2) {

			if(n%i==0) {
				flag=false;
				break;
			}
			i++;
		}
		if(flag==true) {
			System.out.println("it is prime");
		}
		else
			System.out.println("it is not a prime");
	}
}
