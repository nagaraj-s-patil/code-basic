package com;
//add primary digonal element and secondery element
public class Program11 {
 public static void main(String[] args) {
	
	 int[][] arr=ArrayOperations2D.readArray();
	 int sum1=0;
	 int sum2=0;
	 for(int i=0;i<arr.length;i++) {
	 
		 for(int j=0;j<arr[i].length;j++) {
			 
			 if(i+j==arr.length-1) {
				 sum1+=arr[i][j];
			 }
			 if (i==j) {
				 sum2+=arr[i][j];
			 }
			
			 
		 }
	 }
	 System.out.println("sum of digonal element is primary "+sum1);
	 System.out.println("sum of digonal element is secondary "+sum2);
	 int sum=sum1+sum2;
	 System.out.println("sum 1 and sum 2 is "+sum);
}
}
