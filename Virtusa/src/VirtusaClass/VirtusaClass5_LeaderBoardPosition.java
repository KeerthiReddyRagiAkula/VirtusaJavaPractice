package VirtusaClass;
import java.util.*;
public class VirtusaClass5_LeaderBoardPosition {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		int k=0,size=ref.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=ref.nextInt();
		}
		int result[]=new int[size];
		int flag;
		for(int i=0;i<size-1;i++) {
			flag=0;
			for(int j=i+1;j<size;j++) {
				if(arr[i]>=arr[j]) {
					flag=1;
				}
				else {
					
					flag=0;
					break;
				}
			}
			if(flag==1) {
				
				result[k]=arr[i];
				k++;
			}
		}
		for(int i=k-1;i>=0;i--) {
			System.out.print(result[i]+" ");
		}
		ref.close();
	}

}
