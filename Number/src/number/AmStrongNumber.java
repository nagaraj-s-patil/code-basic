package number;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class AmStrongNumber {

	public static int cont(int n) {

		int count=0;
		while(n!=0) {
			count++;
			n/=10;
		}
		return count;
	}
	public static int getpow(int n,int p) {

		int pw=1;
		
		while(p>0) {
			pw=pw*n;
			p--;
		}
		return pw;

	}
	public static int AmStrong(int n ) {

		int sum=0;
		int count=cont(n);
		while(n!=0) {
			int digit=n%10;
			int pwdigit=getpow(digit,count);
			sum=sum+pwdigit;

		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer number");
		int n=sc.nextInt();
		
//		int isAmstrong=	AmStrong(n);

		int sum=AmStrong(n);
		
		

//		if(sum == n) {
//			System.out.println("it is AmStorng number");
//		}
//		else
//			System.out.println("it is not AmStrong number");


		sc.close();

	}
}
