package com;

public class Program26 {
	public static void main(String[] args) {
	
		String str1=StringOperation.input();
		String str2=StringOperation.input();
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		boolean flag=false;
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]==ch2[i]) {
				flag=true;
			}
		}
		
		if(flag) {
			System.out.println("String is equal");
		}
		else
			System.out.println("string is not equeal");
	}
}
