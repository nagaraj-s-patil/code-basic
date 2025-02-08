package com;

public class Program5 {

	public static void main(String[] args) {

		String str=StringOperation.input();

		int upc=0;	int loc=0;
		int dig=0;	int spc=0;

		for(int i=0;i<str.length();i++) {

			if(str.charAt(i)>='A' && str.charAt(i)<='Z') 
				upc++;

			else if(str.charAt(i)>='a' && str.charAt(i)<='z') 
				loc++;


			else if(str.charAt(i)<='0' && str.charAt(i)<='9') 
				dig++;

			else 
				spc++;
			
			
		}
		System.out.println("count upper :"+upc);

		System.out.println("count lower :"+loc);
		
		System.out.println("digit count :"+dig);
		
		System.out.println("space count :"+spc);

	}
}
