package com;
//print digonal element
public class Program10 {
	public static void main(String[] args) {
		
		int[][] arr=ArrayOperations2D.readArray();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(i+j==arr.length-1) {
					System.out.println(arr[i][j]);
				}
			}
		}
	}
}
