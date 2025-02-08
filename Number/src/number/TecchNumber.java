package number;

import java.util.Scanner;

public class TecchNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youer number");
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		while(temp>0) {
			count++;
			temp/=10;
		}
		if(count%2==0) {
		
			int div=1;
		for(int i=0;i<count/2;i++) {
			div=div*10;
			
			
		}
		}
	
		
		
		
		
		sc.close();
	}
	
	
}
