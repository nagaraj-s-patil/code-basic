package com;

import java.util.Scanner;

public class RemoveElementAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[] =ArrayOperation.readArray();
		
		System.out.println("Enter position of element");
		int position=sc.nextInt()-1;

		//10 20 30 40 50
		for(int i=position;i<arr.length;i++) {
			if(i<arr.length-1)
				arr[i]=arr[i+1];
			else
				arr[i]=0;
		}

		ArrayOperation.display(arr);

	}
}
