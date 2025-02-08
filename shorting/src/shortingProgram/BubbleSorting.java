package shortingProgram;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {

		int[] arr=ArrayOperation.readArray();

		ArrayOperation.display(arr);

		System.out.println();
		for(int i=0;i<arr.length-1;i++) {
			int flag=0;
			int temp;
			for(int j=0;j<arr.length-1;j++) {

				if(arr[j]>arr[j+1]) {

					flag=1;
				    temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.println(Arrays.toString(arr));
				
			}
			if(flag==1) {
				break;
			}

			
		}
		System.out.println("sorted");
		ArrayOperation.display(arr);

	}
}
