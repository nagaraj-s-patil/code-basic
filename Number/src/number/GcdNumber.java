package number;

import java.util.Scanner;

public class GcdNumber {
	
	public static int FindGCD(int n,int m) {
		
		while(m!=0) {
			int rem=n%m;
			n=m;
			m=rem;
		}
		
		
		return n;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer first number");
		int n=sc.nextInt();
		System.out.println("Enter youer Second number");
		int m=sc.nextInt();
		
		int GCD=FindGCD(n,m); 
		
		System.out.println("The gcd of "+n+" and "+m+" is "+GCD);
		
		sc.close();
		
	}
}
