package com;

import java.util.*;
public class StudentnametoChar {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		String[] name=new String[size];
		System.out.println("Enter student name");
		
		for(int i=0;i<name.length;i++)
		{
			 name[i]=sc.next();
			
		}
		System.out.println("-------------------------");
		
		for(int j=0;j<name.length;j++) {
			System.out.println(name[j].charAt(0));
		}
		
		sc.close();
	}
	
}
