package com;

public class CountOfDegit {
	
	public static void main(String[] args) {
		
		 
		int num=5345;
		int count=0;
		
		while(num!=0) {
			
			int digit=num%10;
			count++;
			num=num/10;
			
		}
		
	}
}
