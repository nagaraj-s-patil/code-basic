package com;

public class ArrayOfTwoElementSum {
	public static void main(String[] args) {

		int arr[]=ArrayOperation.readArray();
		//10 20 5 16
		int sum=0;
		for(int i=0;i<arr.length;i++) {

			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]>sum) {
					sum=arr[i]+arr[j];
				}
			}

		}
		System.out.println("lerge sum is "+sum);
	}
}
