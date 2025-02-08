package PatternWithNumber;

public class PAttern10 {

	public static void main(String[] args) {
		int n = 10;

		for (int i = 1; i <= n; i++) {
			int a = 1;
			for (int j = 1; j <= n; j++) {

				if (i + j >= n + 1) {
					System.out.print(a);
					if (a == 1)
						a = 0;
					else
						a = 1;

				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
