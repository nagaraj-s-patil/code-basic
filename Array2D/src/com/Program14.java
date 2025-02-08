package com;

import java.util.Scanner;

//w.a.j.p to rotate 90 dig clock ways

/*	1 2 3		1 4 7	row with reverse	7 4 1
	4 5 6  ---> 2 5 8  			--->		8 5 2
	7 8 9		3 6 9						9 6 2 */
public class Program14 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int[][] arr=ArrayOperations2D.readArray();

		System.out.println("enter clock rotation for 1/n enter anticlock for 2");
		int n=sc.nextInt();
		switch(n) {
		case 1:		rotateByClock(arr);
		break;
		case 2:		rotateByAntiClock(arr);
		break;
		default: System.out.println("youer enter wrong key");
		}
	}

	public static void rotateByClock(int[][] arr){

		System.out.println("Array rotation by 90 dig by ");
		arr=transpose(arr);
		arr=revrosRow(arr);

		ArrayOperations2D.display(arr);
	}
	public static void rotateByAntiClock(int[][] arr) {
		System.out.println("Array rotation by 90 dig");
		arr=transpose(arr);
		arr=revrosCol(arr);

		ArrayOperations2D.display(arr);

	}
	public static int[][] transpose (int[][] arr) {

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[i].length;j++) {

				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		return arr;
	}
	public static int[][] revrosRow(int[][] arr) {


		for(int i=0;i<arr.length;i++) {
			int k=arr[i].length-1;

			for(int j=0;j<arr.length/2;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[i][k];
				arr[i][k]=temp;
				k--;
			}
		}
		return arr;
	}
	public static int[][] revrosCol(int[][] arr) {

		System.out.println("Array reverse by column");
		int k=arr.length-1;


		for(int i=0;i<arr.length/2;i++) {

			for(int j=0;j<arr[i].length;j++) {

				int temp=arr[i][j];
				arr[i][j]=arr[k][j];
				arr[k][j]=temp;
			}
			k--;
		}
		return arr;
	}

}
