package com;

import java.util.Scanner;

public class ArrayOperations2D {

	public static int[][] readArray(){

		Scanner sc=new Scanner(System.in);	 
		System.out.println("Enter row size");
		int row=sc.nextInt();
		System.out.println("Enter column size");
		int col=sc.nextInt();

		int[][] array=new int[row][col];
		System.out.println("Enter a values");

		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				array[i][j]=sc.nextInt();
			}
		}sc.close();
		return array;
	}
	public static void display(int[][] array) {

		for(int i=0;i<array.length;i++) {
			System.out.print("[");
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}System.out.print("]");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] array=readArray();
		display(array);
	}
}
