package com;
import java.util.*;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer number");
		int n=sc.nextInt();
		int realNo=n;
		
		int reverse =0;
		
		while(n!=0) {
			int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		
		if(realNo==reverse) {
			System.out.println("this is palindrome");
		}
		
		else 
			System.out.println("this is not palindrome");


	}
}
