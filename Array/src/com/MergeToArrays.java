package com;

public class MergeToArrays {
	public static void MergeArray(int[] arr1,int[] arr2) {

		int[] Marr=new int[arr1.length+arr2.length];

		for(int i=0;i<Marr.length;i++) {
			  

			if(i<arr1.length)
				Marr[i]=arr1[i];
			else
				Marr[i]=arr2[i+1];
		}
		ArrayOperation.display(Marr);
	}

	public static void main(String[] args) {

		int[] arr1=ArrayOperation.readArray();
		int[] arr2=ArrayOperation.readArray();
		
		MergeArray(arr1,arr2);
		

	}
}
