package VirtusaClass;
import java.util.Scanner;
import java.util.Arrays;
public class VirtusaClass7_PosAndNegCouples {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		int size=ref.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=ref.nextInt();
			arr[i]=Math.abs(arr[i]);
			
		}
		Arrays.sort(arr);
		
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(-arr[i]+" "+arr[j]);
				}
			}
		}
		ref.close();
	}

}
