package PatternWithNumber;

public class Pattern1 {

	public static void main(String[] args) {

		int n = 5;         

		for (int i = 1; i <= n; i++) {
			int a=1;
			for (int j = 1; j <= n; j++) {
				 if(j<=i)
				System.out.print(a++ + " ");
				 else
					 System.out.print("  ");
			}
			System.out.println();

		}
	}
}
