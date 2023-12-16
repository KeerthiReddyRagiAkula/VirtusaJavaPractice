package VirtusaAssignment;
import java.util.Scanner;
public class VirtusaAssignment2_ReverseArray {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		int size=ref.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=ref.nextInt();
		}
		for(int i=0;i<size/2;i++) {
			int temp=arr[i];
			arr[i]=arr[size-1-i];
			arr[size-1-i]=temp;
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+"->");
		}
		ref.close();
	}

}
