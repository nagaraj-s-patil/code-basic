package com;
// w.a.j.p transpose the array   
public class program13 {
	public static void main(String[] args) {

		int[][] arr=ArrayOperations2D.readArray();
		transpose(arr);

	}
	public static void transpose (int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[i].length;j++) {
				
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		ArrayOperations2D.display(arr);
	}

}
