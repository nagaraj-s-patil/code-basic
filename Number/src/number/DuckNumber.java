package number;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer number");
		int n=sc.nextInt();//203 023
		boolean flag=false;
		while(n!=0) {
			int digit=n%10;

			if(digit==0) {
				flag=true;
				break;
			}
			n=n/10;	

		}
		if(flag)
			System.out.println("it is Duck number");
		else
			System.out.println("it is Not Duck number");
	}
}
