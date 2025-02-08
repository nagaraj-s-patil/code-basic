package com;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int[] number=new int[size];
		
		for(int i=0;i<number.length;i++) {
			number[i]=sc.nextInt();
		}
		
		System.out.println("-----------------------");
		
		for(int j=0;j<number.length;j++) {
			
			if(number[j]%2==0) {
				System.out.println(number[j]);
			}
		}
		sc.close();
	}
}
