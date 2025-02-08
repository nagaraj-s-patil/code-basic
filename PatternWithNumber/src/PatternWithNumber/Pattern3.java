package PatternWithNumber;

public class Pattern3 {

	public static void main(String[] args) {
		
		int n =5                 ;         

		for (int i = 1; i <= n; i++) {
			char ch='A';
			for (int j = 1; j <= n; j++) {
				 if(j<=i)
				System.out.print(ch++ + " ");
				 else
					 System.out.print("  ");
			}
			System.out.println();

		}
	}
}
