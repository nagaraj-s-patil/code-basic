package com;

public class FrequentElement {
	public static void main(String[] args) {
		//10 20 20 10 20 40
		int[] arr=ArrayOperation.readArray();
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=0;
				} 
			
			}
			if(arr[i]!=0)
			System.out.println(arr[i] +" ->"+count);
			
		}
	}
}
