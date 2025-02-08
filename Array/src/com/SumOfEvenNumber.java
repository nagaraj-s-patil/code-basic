package com;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int[] num=new int[size]; 
		
		System.out.println("Enter "+size+" numbers");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		int sum=0;
		
		for(int j=0;j<num.length;j++) {
			sum+=num[j];
		}
		System.out.println("sum of "+size+" element is "+sum);
		sc.close();
	}
}
