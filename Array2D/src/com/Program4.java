package com;

public class Program4 {
	public static void main(String[] args) {

		int[][] mtr=ArrayOperations2D.readArray();
		int sum=0;

		for(int i=0;i<mtr.length;i++) {
			for(int j=0;j<mtr[i].length;j++) {
				sum+=mtr[i][j];
			}

		}

		System.out.println("sum of matrx is "+sum);
	}
}
