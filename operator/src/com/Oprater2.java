package com;
import java.util.Scanner;

public class Oprater2 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter youer 1st char");		
		char ch1=sc.next().charAt(0);

		System.out.println("Enter youer 2nd char");		
		char ch2=sc.next().charAt(0);

		System.out.println(ch1<= ch2 && ch1==ch2);	
		
		System.out.println();
	}
}

