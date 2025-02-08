package com;
import java.util.*;
public class LargestElement {

	public static int FindLargestElement(int lergestE,int number) {
		
		if(lergestE<number)
			return number;
		
		return lergestE;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Eneter youer size of array");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter youer element of array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int lergesteE=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
		  lergesteE=FindLargestElement(lergesteE, arr[i]);
			
		}
		System.out.println(lergesteE);
		
		sc.close();
	}
}
