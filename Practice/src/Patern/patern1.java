package Patern;

public class patern1 {

	public static void main(String[] args) {

		int n = 3;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - 2; j++) {
				if (i == 2 || j == 1 && i == 3 || j == 3)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
/*
 *   1 2 3 4 5
 *  1
 *  2
 *  3
 *  4
 *  5
 *  
 * */
 */