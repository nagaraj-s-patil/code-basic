package com;

public class Pattern18 {

	public static void main(String[] args) {
		
		int n=9;
		for (int i = 1; i <= n * 2 - 1; i++) {

			for (int j = 1; j <= n * 2 - 1; j++) {

				if (i>=j &&i+j<=n*2 ||i<=j  && i+j>=n*2) {
					System.out.print("*" + " ");
				} else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}
