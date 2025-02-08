package com;

public class Program23 {

	public static void main(String[] args) {

		int[] arr1=ArrayOperation.readArray();
		int[] arr2=ArrayOperation.readArray();

		

		for(int i=0;i<arr1.length;i++) {
			boolean flag=false;
			for(int j=0;j<arr2.length;j++) {

				if(arr1[i]==arr2[j]) {
				
						arr2[j]=0;
						flag=true;
				}
			}
			if(flag)
				System.out.println(arr1[i]);
		}

	}
}
