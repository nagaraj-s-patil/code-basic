package com;

import java.util.Scanner;

public class Pater7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer first number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=n*2-1;j++) {
				
				System.out.print(i+j>=n+1 && i-1<=j? "*"+" ":" "+" ");
			}
			System.out.println();
		}
		
	}
	}

