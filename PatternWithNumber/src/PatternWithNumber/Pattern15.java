package PatternWithNumber;

public class Pattern15 {

	public static void main(String[] args) {
		
		int n = 5;

		for (int i = 1; i <= n; i++) {
			int a = n;
			for (int j = 1; j <= n * 2 - 1; j++) {

				if (i + j >= n + 1 && j - i <= n - 1) {
					if (j < n) {
						System.out.print(a + " ");
						a--;
					} else {
						System.out.print(a + " ");
						a++;
					}

				} else
					System.out.print("  ");

			}
			System.out.println();
		}
	}
}
