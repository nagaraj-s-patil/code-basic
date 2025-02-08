package number;

import java.util.Scanner;

public class MpublerN {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter youer number");
		int n=sc.nextInt();
		int p=sc.nextInt();

		int pw=1;


		for(;p>0;p--) {
			pw*=n;
			
		}
		System.out.println(pw);



	}
}
