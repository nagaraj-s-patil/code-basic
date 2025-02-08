package PatternWithNumber;

public class Pattern27 {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n * 2 - 1; i++) {
			int a=1;
			for	(int j = 1; j <= n * 2 - 1; j++) {

				if (i<=j && i+j<=2*n || i+j>=2*n && i>=j )
				{		
					System.out.print(a);
					if(a==1) {
						a=0;
					}
					else
						a=1;
					

				}
				else
					System.out.print(" ");

			}
			System.out.println();

		}
	}
}
