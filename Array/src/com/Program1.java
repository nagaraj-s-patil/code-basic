package com;
import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("arr size give me");
		int n=sc.nextInt();
		
		String[] arrName=new String[n];
		
		for(int i=0;i<arrName.length;i++) {
			
			arrName[i]=sc.next();
		}
		
		for(int i=0;i<arrName.length;i++) {
			
			System.out.println("Arry indix: "+i+" name: "+arrName[i]);
		}
		sc.close();
		
	}
}
