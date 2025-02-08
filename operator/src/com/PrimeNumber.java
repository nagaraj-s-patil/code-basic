package com;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer number");
		int n=sc.nextInt();

		boolean flag=true;
		for(int i=2;i<n;i++) {

			if(n%i==0) {

				flag=false;
				break;
			}


		}
		if(flag==true) {
			System.out.println("it is prime number");
		}
		else
			System.out.println("it is not a prime number");
		sc.close();
	}

}

