package PatternWithNumber;

public class Pattern20 {

	public static void main(String[] args) {

		int n=5;
		
		for(int i=1;i<=n;i++) {
			int a=n-i+1;
			for(int j=1;j<=n*2-1;j++) {

				if(i<=j &&i+j<=n*2) {
					System.out.print(a);
					if(j<n) {
						a--;						
					}
					else
						a++;
				}
				else
					System.out.print(" ");


			}System.out.println();
			

		}
	}
}
