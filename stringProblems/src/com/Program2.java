package com;


public class Program2 {

	public static void main(String[] args) {
		
		String str=StringOperation.input();
		String str2="";
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				str2 +=(char)(str.charAt(i)+32);
			}
			else
				str2+=str.charAt(i);
				
		}
		
		System.out.println(str2);
	}
	
}
