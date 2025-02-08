package com;

import java.util.Scanner;

public class SecondLergest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Eneter youer size of array");
		int n=sc.nextInt();
		int[] arr= new int[n];
		
		System.out.println("Enter youer element of array");

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int firstL=arr[0];
		int secondL=arr[1];
		
		for(int j=0;j<arr.length;j++) {
			
			if(firstL<arr[j]) {
				secondL=firstL;
				firstL=arr[j];
			}
			else if(arr[j]>secondL && arr[j]!=firstL) {
					secondL=arr[j];
			}
		}
		System.out.println(secondL);
		
		
		
		
		
		
		
		
		sc.close();
	}
}
