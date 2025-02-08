package com;

import java.util.Scanner;

public class OneToTwoArray {
	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter youer size of array");
		int n=sc.nextInt();
		int[] MainArr= new int[n];
		
		System.out.println("Enter youer element of array");

		for(int i=0;i<MainArr.length;i++) {
			MainArr[i]=sc.nextInt();
		}

		
		
		
		int[] arr1=new int[MainArr.length/2];
		int[] arr2=new int[MainArr.length/2];
		int a=0;
		for(int i=0;i<MainArr.length;i++) {

			if(i< arr1.length) {
				arr1[i]=MainArr[i];
			}
			else {
				arr2[a]=MainArr[i];
				a++;
			}
		}

		ArrayOperation.display(arr1);
		ArrayOperation.display(arr2);
	}
}
