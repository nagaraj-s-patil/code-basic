package com;

public class Patern17 {

	public static void main(String[] args) {

		int n=3;
				for (int i = 1; i <= n * 2 - 1; i++) {

					for (int j = 1; j <= n * 2 - 1; j++) {

						if (i+j<=n || i-j>=n || i+j >=9 ||j-i>=n) {
							System.out.print("*" + " ");
						} else
							System.out.print(" " + " ");
					}
					System.out.println();
				}
	}
}
