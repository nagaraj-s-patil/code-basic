package PatternWithNumber;

public class Patern9 {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			int a=n;
			for(int j=1;j<=n;j++) {
				
				if(i+j>=n+1) {
					System.out.print(a);
					a--;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
