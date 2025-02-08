package com;

public class Program6 {
	public static void main(String[] args) {
		
		int[][] ar=ArrayOperations2D.readArray();
		int[][] br=ArrayOperations2D.readArray();
		
		if(ar.length ==br.length && ar[0].length==br[0].length) {
			
			int[][] crr=new int[ar.length][ar[0].length];
			
			for(int i=0;i<ar.length;i++) {
			
				for(int j=0;j<ar[i].length;i++) {
					crr[i][j]=ar[i][j]+br[i][j];
				}
				ArrayOperations2D.display(crr);
			}
			
		}
		else
			System.out.println("matrix size are not same");
	}
}
