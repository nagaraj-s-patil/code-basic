package PatternWithNumber;

public class PAttern23 {

	public static void main(String[] args) {

		int n = 3;

		for (int i = 1; i <= n * 2 - 1; i++) {
			int a = 1;
			for (int j = 1; j <= n * 2 - 1; j++) {

				if (i + j >= n + 1 && j - i <= n - 1 && i - j <= n - 1 && i + j <= 3 * n - 1)
				{					
					System.out.print(a%2);
					a++;

				}
				else
					System.out.print(" ");

			}
			System.out.println();

		}
	}
}
