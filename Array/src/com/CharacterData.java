package com;

import java.util.*;
public class CharacterData {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		char[] ch=new char[size];
		
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.next().charAt(0);
		}
		
		System.out.println("---------------------------");
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		sc.close();
	}
}
