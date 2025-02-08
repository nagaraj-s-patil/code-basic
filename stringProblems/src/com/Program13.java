package com;

import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=StringOperation.input();
		String str1="";

		for(int i=0;i<str.length();i++) {

			if(i==str.length()-1) {
				str1=str1+(char)(str.charAt(i)-32);
			}
			else if(str.charAt(i+1)==' ') {
				str1=str1+(char)(str.charAt(i)-32);
				str1=str1+' ';
				i++;
			}
			
			else
				str1=str1+str.charAt(i);
		}
		
		System.out.println(str1);
		sc.close();

	}
}
