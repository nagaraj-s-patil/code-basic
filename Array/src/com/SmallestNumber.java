package com;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Eneter youer size of array");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter youer element of array");

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int smallest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		System.out.println("Smallest is "+smallest);
		sc.close();
	}
	
}
