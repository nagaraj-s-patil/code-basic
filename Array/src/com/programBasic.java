package com;

import java.util.Scanner;

public class programBasic {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		
		}
		System.out.println("Printing the data from array");
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
		sc.close();
		}
	}

}
