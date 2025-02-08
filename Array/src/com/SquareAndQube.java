package com;

public class SquareAndQube {
	public static void main(String[] args) {

     
     int[] arr=ArrayOperation.readArray();
     int sq=1;
     int qub=1;
     
     int[] arrSq=new int[arr.length];
     int[] arrQub=new int[arr.length];
     
     for(int i=0;i<arr.length;i++) {
    	 
    	  sq=arr[i]*arr[i];
    	 qub=arr[i]*arr[i]*arr[i];
    	 arrSq[i]=sq;
    	 arrQub[i]=qub;
     }
     
     ArrayOperation.display(arrSq);
     ArrayOperation.display(arrQub);
     
     
		
	}
}
