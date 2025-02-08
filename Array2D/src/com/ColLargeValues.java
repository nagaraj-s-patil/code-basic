package com;

public class ColLargeValues {
	public static void main(String[] args) {

		int[][] arr=ArrayOperations2D.readArray();

		for(int i=0;i<arr.length;i++) {
			int large=0;
			for(int j=0;j<arr[i].length;j++) {

				if(arr[j][i]>=large) {
					large=arr[j][i];
				}
			}
			System.out.println(i+" largest values each column "+large);
		}
		/**

Trace Example (Assume Input Array):
Let arr be:

Copy code
3  1  4
2  8  6
7  5  9
Execution Steps:
Column 0 (i=0):

Compare arr[0][0] = 3, arr[1][0] = 2, arr[2][0] = 7. Largest = 7.
Print: 0 largest values each column 7.
Column 1 (i=1):

Compare arr[0][1] = 1, arr[1][1] = 8, arr[2][1] = 5. Largest = 8.
Print: 1 largest values each column 8.
Column 2 (i=2):

Compare arr[0][2] = 4, arr[1][2] = 6, arr[2][2] = 9. Largest = 9.
Print: 2 largest values each column 9.
Output:


0 largest values each column 7
1 largest values each column 8
2 largest values each column 9
		 * */
	}
}
