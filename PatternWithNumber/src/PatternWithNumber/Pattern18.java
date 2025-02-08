package PatternWithNumber;

public class Pattern18 {



	public static void main(String[] args) {

		/*	1 2 3 4 5 6 7 8 9 
		 
		1	1 0 1 0 1 0 1 0 1 
  		2	  1 0 1 0 1 0 1   
        3       1 0 1 0 1     
        4         1 0 1       
        5           1         


	*/
		int n = 5;

		for (int i = 1; i <= n; i++) {
			int a = 1;	
			for (int j = 1; j <= n * 2 - 1; j++) {

				if (i<=j && j+i<=n*2 ) {

					System.out.print(a+" ");
					if(a==1) {
						a=0;
					}
					else {
						a=1;
					}


				} else
					System.out.print("  ");

			}
			System.out.println();
		}

	}
}