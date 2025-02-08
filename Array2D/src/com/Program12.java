package com;
public class Program12 {
	public static void main(String[] args) {

		int[][] arr=ArrayOperations2D.readArray();
		revrosRow(arr);
		revrosCol(arr);


	}
	//reverse row
	public static void revrosRow(int[][] arr) {

		System.out.println("Array revers by Row");

		for(int i=0;i<arr.length;i++) {
			int k=arr[i].length-1;

			for(int j=0;j<arr.length/2;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[i][k];
				arr[i][k]=temp;
				k--;
			}
		}
		ArrayOperations2D.display(arr);
	}
	
	public static void revrosCol(int[][] arr) {
		
		System.out.println("Array reverse by column");
		int k=arr.length-1;
		
		
		 for(int i=0;i<arr.length/2;i++) {
			 
			 for(int j=0;j<arr[i].length;j++) {
				 
				 int temp=arr[i][j];
				 arr[i][j]=arr[k][j];
				 arr[k][j]=temp;
			 }
			 	k--;
		 }
		ArrayOperations2D.display(arr);
	}
	
	
}

