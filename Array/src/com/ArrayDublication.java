package com;

public class ArrayDublication {
	public static void main(String[] args) {
		
		int[] arr=ArrayOperation.readArray();
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j])
					System.out.println(arr[i]);
				
			}
		}
		
	}
	
}
