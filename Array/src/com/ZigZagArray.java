package com;

public class ZigZagArray {
	
	public static int[] mergeArray(int[] array1,int[] array2) {
		
		int size=array1.length+array2.length;
		int[] finalArray=new int[size];
		int a=0, b=0;
		for(int i=0;i<finalArray.length;i++) {
			
//			if(i%2==0) {
//				finalArray[i]=array1[a];
//				a++;
//			}
//			else {
//				finalArray[i]=array2[b];
//			    b++;
//			}
			finalArray[i]=array1[a];
			a++;
			i++;
			
			finalArray[i]=array2[b];
			b++;
			
		}
		
		return finalArray;
		
	}
	public static void main(String[] args) {
		
		//first Array
		int[] arr1=ArrayOperation.readArray();
		//Second Array
		int[] arr2=ArrayOperation.readArray();
		
		int[] Farr=mergeArray(arr1,arr2);
		
		for(int i=0;i<Farr.length;i++) {
			
			System.out.println(Farr[i]);
		}
		
	}
}
