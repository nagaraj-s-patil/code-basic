package com;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] Arr=ArrayOperation.readArray();
		
		int[] reverceArr=new int[Arr.length];

		for(int i=0;i<Arr.length;i++) {

			reverceArr[i]=Arr[Arr.length-i-1];
		}
		
		for(int i=Arr.length-1;i<=0;i--){
            System.out.print(Arr[i]+" ");
        }
		ArrayOperation.display(reverceArr);
	}
}