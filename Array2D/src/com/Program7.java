package com;

public class Program7 {
	public static void main(String[] args) {
		int[][] arr=ArrayOperations2D.readArray();

		for(int i=0;i<arr.length;i++) {
			int large=0;

			for(int j=0;j<arr[i].length;j++) {
				
				if(arr[i][j]>large) {
					large=arr[i][j];
				}
			}
			System.out.println(i+" large element is: "+large);
		}
	}
}
