package PatternHollow;

public class Pattern5 {

	public static void main(String[] args) {
		
		int n=3;
		
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
			
				if(i+j==n+1 ||j-i==n-1 ||i-j==n-1||i+j==n*n-1   )
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
/* *I
  
     *  
 	* * 
   *   *
    * * 
 	 *  
any one condition is


*/
	}
}
