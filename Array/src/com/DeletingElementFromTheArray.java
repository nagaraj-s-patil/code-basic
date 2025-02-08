package com;
import java.util.*;
public class DeletingElementFromTheArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] arr=ArrayOperation.readArray();
		
		System.out.println("give me index for delete");
		int index=sc.nextInt();
		
		for(int i=index;i<arr.length;i++) {
			
			if(i<arr.length-1)
				arr[i]=arr[i+1];
			else
				arr[i]=0;
				
			
		}
		ArrayOperation.display(arr);
		
	}
}
