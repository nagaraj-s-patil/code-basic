package com;

import java.util.Scanner;

public class DeleteElementOnArray {
	public static void DeleteElement(int[] arr,int index) {
		
		int[] br=new int[arr.length-1];
//		if(index<0 ||)
		for(int i=0;i<br.length;i++) {
			
			if(i<index)
				br[i]=arr[i];
			else
				br[i]=arr[i+1];
		}
		ArrayOperation.display(br);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=ArrayOperation.readArray();
		
		System.out.println("Enter index number");
		int index=sc.nextInt();
		
		DeleteElement(arr,index);
		sc.close();
	}
}
