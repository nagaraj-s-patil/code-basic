package PatternWithNumber;

public class Pattern26 {

	public static void main(String[] args) {

		int n = 5				;

		for (int i = 1; i <= n * 2 - 1; i++) {
			int a=1;
			for	(int j = 1; j <= n * 2 - 1; j++) {

				if (i<=j && i+j<=2*n || i+j>=2*n && i>=j )
				{				
					System.out.print(a++);

				}
				else
					System.out.print(" ");

			}
			System.out.println();

		}
	}
}
