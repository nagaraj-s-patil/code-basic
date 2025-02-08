package com;

public class FactorialNumber {

	public static int fact(int f) {
		
		int produc=1;
		
		for(int i=f;i>=1;i--) {
			produc*=i;
		}
		
		return produc;
	}
	public static void main(String[] args) {
		
		int[] arr= {2,3,4,5,9};
		int[] farr=new int[arr.length];
		
		
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		System.out.println("=========");
		
		for(int i=0;i<arr.length;i++) {
			
			farr[i]=fact(arr[i]);
			
			
		}
		System.out.println("=========");
		
		System.out.println("[index] -> userArray -> factoriyalArray");
		for(int k=0;k<farr.length;k++) {
			System.out.println("["+k+"] -> "+arr[k]+" -> "+farr[k]);
		}
		
	}
}
