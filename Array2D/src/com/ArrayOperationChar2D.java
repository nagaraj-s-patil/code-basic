package com;

import java.util.Scanner;

public class ArrayOperationChar2D {

	public static char[][] readArray(){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size of Array");
		int row=sc.nextInt();
		System.out.println("Enter column size of Array");
		int col=sc.nextInt();

		char[][] array=new char[row][col];

		System.out.println("Enter Character");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				array[i][j]=sc.next().charAt(0);
			}
		}
		return array;
	}

	public static void display(char[][] array) {

		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {

				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		char[][] ch=readArray();

		display(ch);
	}
}
