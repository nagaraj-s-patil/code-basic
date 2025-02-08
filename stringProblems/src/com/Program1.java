package com;

public class Program1 {

	public static void main(String[] args) {
		
		String str=StringOperation.input();
		
		int i=0;
		int j=str.length()-1;
		boolean flag=false;
		
		while(i<=j) {
			
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}
			else {
				flag=true;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println("it is not a palindrome String");
		}
		else
			System.out.println("it is palindromee");
		}
	}

