package VirtusaClass;
import java.util.*;
public class VirtusaClass4_RankOfArray {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		int size=ref.nextInt();
		int arr[]=new int[size];
		int d_arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=ref.nextInt();
			d_arr[i]=arr[i];
		}
		Arrays.sort(d_arr);
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(arr[i]==d_arr[j]) {
					arr[i]=j+1;
					break;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		ref.close();
		
	}

}
