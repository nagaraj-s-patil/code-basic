package PatternWithNumber;

public class Pattern11 {

	public static void main(String[] args) {
		int n=10;
		
		for(int i=1;i<=n;i++) {
			int a=1;
			for(int j=1;j<=n*2-1;j++) {

				if(i+j>=n+1 && j-i<=n-1) {
					System.out.print(a++ );
					
				}
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}

/*    1  2  3  4  5 
 *  1       1
 *  2    1  2  3
 *  3 1  2  3  4   5
 *  
 * 
 * */
