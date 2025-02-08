package com;

public class Program {

	public static void count(int[] arr) {
		int odd=0;
		int even=0;
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0)
				even++;
			else
				odd++;
		}
		
		System.out.println("the odd element is "+odd);
		System.out.println("the even element is "+even);
		
	}
	public static void main(String[] args) {
		
	
		int[] arr=ArrayOperation.readArray();
		count(arr);
		
	}
}
