package com;
import java.util.Scanner;

public class TenaryOperater {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter two number");
		int a= sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(a>b ?"a is largest":"b is largest");
	}
}
