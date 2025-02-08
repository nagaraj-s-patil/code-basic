package com;

import java.util.*;

public class SumOfAvrage {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer Number");
		int N=sc.nextInt();
		
		int sum=0;
		int count=0;
		while(N>0) {
			
			int digit=N%10;
			sum+=digit;
			N=N/10;
			count++;
			
		}
		int avg=sum/count;
		
		System.out.println("sum of this digit "+sum);
		System.out.println("count is "+count);
		System.out.println("avg is "+avg);
		
		sc.close();
	}
}
