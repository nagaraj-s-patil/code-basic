package com;

import java.util.*;
public class FindTwoDigitenumber {

	public static void main(String[] args) {

		System.out.println("Enter youer number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println((a>9 && a<100 )|| (a<-9 && a>-100) ? "this is two digit number":"this is not two digit number");
	}
}
