package com;

public class Program15 {

	public static void main(String[] args) {
		
		String str=StringOperation.input();
		
		int[] count=new int[26];
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(ch>='A' &&ch<='Z')
				count[ch-65]++;
		}
		
		for(int i=0;i<count.length;i++) {
			
			if(count[i]!=0) {
				System.out.println((char)(i+65)+"--> "+count[i]);
			}
		}
	}
}
