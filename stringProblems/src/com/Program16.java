package com;

public class Program16 {
	
	
	public static boolean  checkPangram(String s) {
		
		s=s.toLowerCase();
		
		boolean[] letters=new boolean[26];
		int index;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				index=s.charAt(i)-'a';
				letters[index]=true;
			}
		}
		
		for(boolean leter :letters) {
			
			if(!leter)
				return false;
			
		}
		
		return true;
	
		
		
	
	}
	public static void main(String[] args) {
		String s=StringOperation.input();
		
		
		if(checkPangram(s))
			System.out.println("it is pangram");
		else
			System.out.println("it is not pangram");
	}
}
