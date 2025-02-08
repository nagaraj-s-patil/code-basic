package com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program17 {
	
	public static char[] Arraysort(char[] array) {
		
		for(int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				char temp=array[i];
				array[i]=array[i+1];
				array[i+1]=array[i];
			}
		}
		return  array;
	}

	public static boolean isAnagram(String s1,String s2) {
	
		s1=s1.replace("//s", "").toLowerCase();
		s2=s2.replace("//s","").toLowerCase();
		
		if(s1.length() !=s2.length()) {
			return false;
		}
		//convert string to char Array
		char[] ArrayCh1=s1.toCharArray();
		char[] Arraych2=s2.toCharArray();
		
		char[] Ach1=Arraysort(ArrayCh1);
		char[] Ach2=Arraysort(Arraych2);
		
		
		
		return Arrays.equals(Ach1, Ach2);
	}
	public static void main(String[] args) {
		
		String s1=StringOperation.input();
		String s2=StringOperation.input();
		
		if(isAnagram(s1,s2))
			System.out.println("it is Anagram program");
		else
			System.out.println("it is not Anagram program"0);
	
	}
}
