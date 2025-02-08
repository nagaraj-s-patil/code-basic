package com;

public class pattern6 {
	public static void main(String[] args) {
		
	int n=3;
		System.out.println("hello");
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=2*n-1;j++) {
				
				if(i+j>=n+1 && j-i<=n-1) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
