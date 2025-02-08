package com;

public class Paattern15 {

	public static void main(String[] args) {

		int n = 3;

		for(int i=1;i<=n*2-1;i++) {
			
			for(int j=1;j<=n;j++) {
				
				System.out.print(i+j<=n+1 || i-j>=n-1? "*"+" ":" "+" ");
			}
			System.out.println();
		}
	}
}
