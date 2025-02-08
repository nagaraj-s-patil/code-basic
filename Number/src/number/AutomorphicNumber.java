package number;

import java.util.Scanner;
public class AutomorphicNumber {



	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer number");
		int n=sc.nextInt();

		boolean flag=true;
		int square=n*n;

		while(n!=0) {

			if(n%10 == square%10) {
				n=n/10;
				square=square/10;
			}
			else
			{
				flag=false;
				break;
			}

			if(flag==true)
				System.out.println("Automorphic Number");
			else
				System.out.println("Not Automorphic Number");
		}
	}
}
