package com;
import java.util.*;
public class CharacterArrayPollendrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer size of array");
		int n=sc.nextInt();
		char[] arr=new char[n];
		boolean flag=true;
		System.out.println("Enter youer Alphbet");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
		}
		
		for(int j=0;j<arr.length/2;j++) {
			
			if(arr[j]!=arr[arr.length-1-j]) {
				flag=false;
			}
			
		}
		
		if(flag) {
			System.out.println("Polendrom");
		}
		else
			System.out.println("not a polendrom");
		
		
	}
}
