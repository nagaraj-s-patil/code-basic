package PatternWithNumber;

public class Pattern25 {

	public static void main(String[] args) {
		int n = 5				;

		for (int i = 1; i <= n * 2 - 1; i++) {
			int a = 0;
			 if(i<n)
				 a=i;
			 else
				 a=2*n-i;
			for (int j = 1; j <= n * 2 - 1; j++) {
				
				//int b=j-n+1;
				if (i + j >= n + 1 && j - i <= n - 1 && i - j <= n - 1 && i + j <= 3 * n - 1)
				{			
					if(j<n)
						System.out.print(a--);

					else
						System.out.print(a++);

				}
				else
					System.out.print(" ");

			}
			System.out.println();

		}

	}
}
