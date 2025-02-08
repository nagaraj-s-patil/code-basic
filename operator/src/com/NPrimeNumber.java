package com;
import java.util.*;

public class NPrimeNumber {

	static boolean Prime(int num) {

		for(int i=0;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer number");
		int n=sc.nextInt();

		for(int j=2  ;j<=n;j++) {
			boolean result=Prime(j);
			if(result=true) {
				System.out.println(result);
			}
		}
		sc.close();
	}


}


