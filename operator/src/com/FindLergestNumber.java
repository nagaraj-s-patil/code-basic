package com;

import java.util.Scanner;
public class FindLergestNumber {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer number");
		int n=sc.nextInt();

		int lorge=0;
		while(n!=0) {

			int digit=n%10; //	
			if(digit>lorge) 
			{
				lorge=digit;
			}
			n=n/10;

		}
		System.out.println(lorge);

		sc.close();
	}


}
