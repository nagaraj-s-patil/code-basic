import com.ArrayOperation;

public class ReverseEachElement {

	public static void main(String[] args) {


		int[] arr=ArrayOperation.readArray();

		for(int i=0;i<arr.length;i++) {
			int temp;
			while(arr[i]!=0) {
				int digit=arr[i]%10;
				temp=temp*10+digit;
				arr[i]/10;
			}
			a[i]=temp;
		}

		ArrayOperation.display(arr);
	}

}

