package com;
import java.util.Scanner;
public class InsertEelmentInPosition {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		// 10 20 30 40 50
		System.out.println("Eneter youer size of array");
		int n=sc.nextInt();
		int[] arr= new int[n+1];
		
		System.out.println("Enter youer element of array");

		for(int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter element");
		int ele=sc.nextInt();
		System.out.println("Enter position");
		int postion=sc.nextInt();
							
		for(int j=arr.length-1;j>=postion-1;j--) {
				
			arr[j]=arr[j-1];
		}
		arr[postion-1]=ele;
		ArrayOperation.display(arr);
	}




}
