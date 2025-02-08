package com;

public class pater20 {

	public static void main(String[] args) {

		int n =3 ;

		for (int i = 1; i <= n * 2 - 1; i++) {

			for (int j = 1; j <= n; j++) {

				if (i == 1 || i == n || i == n * 2 - 1 || j == 1 && i < n || j == n && i >= n)
{
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();

		}
	}
}
