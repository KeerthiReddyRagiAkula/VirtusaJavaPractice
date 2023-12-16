package VirtusaClass;
import java.util.Scanner;
public class VirtusaClass6_MaxConsOnes {
	public static int CountOfOnes(int arr[],int size) {
		int t_max=1,o_max=0;
		for(int i=0;i<size-1;i++) {
			if(arr[i]==arr[i+1] && arr[i]==1) {
				t_max++;
				if(t_max>=o_max) {
					o_max=t_max;
				}
			}
			else {
				t_max=1;
			}
		}
		return o_max;
		
	}

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		int size=ref.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=ref.nextInt();
		}
		int result=CountOfOnes(arr,size);
		System.out.println(result);
		ref.close();
	}

}
