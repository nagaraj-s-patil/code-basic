package com;

import java.util.Arrays;

public class Program14 {

	public static void main(String[] args) {

		String str=StringOperation.input();
		char[] str2=new char[str.length()];

		for(int i=0;i<str2.length;i++) {
			str2[i]=str.charAt(i);
		}


		System.out.print(Arrays.toString(str2));





	}
}
