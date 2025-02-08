package number;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer number");
		int n=sc.nextInt();
		boolean flag=true
				;
		int temp=n;
		int sum=0;
		while(temp!=0) {
			int digit=n%10;
			int squ=digit*digit;
			sum=sum+squ;
			n=n/n;
			if(n==1) {
				flag=true;
				break;
			}
			else if(n==n){
				flag=false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("it is happy number");
		}
		else
			System.out.println("it is not happy number");
	}



}
