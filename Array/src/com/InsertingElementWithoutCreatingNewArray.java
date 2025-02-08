package com;
import java.util.*;
public class InsertingElementWithoutCreatingNewArray {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Eneter youer size of array");
		int n=sc.nextInt();
		int[] arr= new int[n+1];
		
		System.out.println("Enter youer element of array");

		for(int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter youer data");
		int data=sc.nextInt();
		System.out.println("Enter index ");
		int index=sc.nextInt();
		
		for(int i=arr.length-1;i>index;i--) {
			
			arr[i]=arr[i-1];
			
		}
		arr[index]=data;
		
		ArrayOperation.display(arr);
		
		
		
	}
}
