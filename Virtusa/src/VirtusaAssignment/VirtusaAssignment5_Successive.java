package VirtusaAssignment;
import java.util.Arrays;
import java.util.Scanner;
public class VirtusaAssignment5_Successive {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		int size=ref.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=ref.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
		System.out.println(SuccessiveCheck(arr,size));
		ref.close();

	}
	public static int SuccessiveCheck(int arr[],int size) {
		for(int i=0;i<size-1;i++) {
			if(arr[i+1]-1!=arr[i]) {
				return 0;
			}
		}
		return 1;
	}

}
