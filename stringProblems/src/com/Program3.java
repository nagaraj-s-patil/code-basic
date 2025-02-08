package com;

public class Program3 {

	public static void main(String[] args) {
		
		String str=StringOperation.input();
		String str2="";
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				
				str2 +=(char)(str.charAt(i)-32);
			}
		}
		
		System.out.println(str2);
	}
}
