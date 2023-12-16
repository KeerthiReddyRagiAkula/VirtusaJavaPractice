package VirtusaClass;
import java.util.Scanner;
public class VirtusaClass1_RevHalfWay {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ref=new Scanner(System.in);
		int i,j,size=ref.nextInt();
		int arr[]=new int[size];
		for(i=0;i<size;i++) {
			arr[i]=ref.nextInt();
		}
		for(i=0,j=size/2-1;i<j;i++,j--) {
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
		}
		for(i=size/2,j=size-1;i<j;i++,j--) {
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
		}
		for(i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		ref.close();
	}

}
