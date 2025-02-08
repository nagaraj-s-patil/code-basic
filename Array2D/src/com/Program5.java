package com;

public class Program5 {
	public static void main(String[] args) {

		int[][] arr=ArrayOperations2D.readArray();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(isPrime(arr[i][j])) {
					count++;
				}
			}
		}
		System.out.println("prime count is "+count);


	}
	public static boolean isPrime(int n) {

		if(n==1)
			return false;
		for(int i=2;i<n;i++) {

			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
