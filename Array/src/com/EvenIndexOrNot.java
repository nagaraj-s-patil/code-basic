package com;

import java.util.Scanner;

public class EvenIndexOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int[] num=new int[size]; 
		
		for(int i=0;i<num.length;i++) {
			
			num[i]=sc.nextInt();
			
		}
		
		for(int j=0;j<num.length;j++) {
			
			if(j%2==0) {
				System.out.println("["+j+"] -> "+num[j]);
			}
		}
		sc.close();
	}
}
