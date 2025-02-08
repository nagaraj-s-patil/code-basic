package com;

import java.util.Scanner;

public class AndOprater {

	public static void main(String[] arg) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();

		System.out.println(num1>=num2 &&num1==num2);
	}

}