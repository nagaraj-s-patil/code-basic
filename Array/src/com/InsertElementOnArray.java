package com;

import java.util.Scanner;

public class InsertElementOnArray {

	public static void isInsert(int[] arr,int index,int data) {
		
		int[] br=new int[arr.length+1];
		
		if(index<0 || index>=arr.length) {			
			System.out.println("index is invalid");			
		}
		else {
			br[index]=data;
			for(int i=0;i<arr.length;i++) {
				
				if(i<index) 
					br[i]=arr[i];
				
				else 
					br[i+1]=arr[i];
				
			}
			ArrayOperation.display(br);
		}
		
		
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int[] arr=ArrayOperation.readArray();

		System.out.println("Enter index of array ");
		int index=sc.nextInt();
		
		System.out.println("Enter data to add on array ");
		int data=sc.nextInt();


		isInsert(arr,index,data);
		sc.close();
	}
}
