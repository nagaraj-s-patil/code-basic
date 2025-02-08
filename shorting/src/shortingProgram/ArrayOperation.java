package shortingProgram;

import java.util.*;
public class ArrayOperation {

	public static int[] readArray() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter youer size of array");
		int n=sc.nextInt();
		int[] arr= new int[n];
		
		System.out.println("Enter youer element of array");

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}

		return arr;
	}
	public static void display(int[] arr) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();

	}
	
}
