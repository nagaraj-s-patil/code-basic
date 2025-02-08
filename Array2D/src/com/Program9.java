package com;

public class Program9 {
	public static void main(String[] args) {
		
		int[][] arr=ArrayOperations2D.readArray();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				if(i==j) {
					System.out.println(arr[i][j]);
				}
			}
		}
	}
}
