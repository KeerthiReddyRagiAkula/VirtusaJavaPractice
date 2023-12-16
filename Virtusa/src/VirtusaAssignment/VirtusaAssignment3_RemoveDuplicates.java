package VirtusaAssignment;
import java.util.Arrays;
import java.util.Scanner;
public class VirtusaAssignment3_RemoveDuplicates {
	public static void main(String args[]) {
		Scanner ref=new Scanner(System.in);
		int size=ref.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=ref.nextInt();
		}
		Arrays.sort(arr);
		int hashsize=arr[size-1];
		int hashArray[]=new int[hashsize+1];
		for(int i=0;i<=hashsize;i++) {
			hashArray[i]=0;
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<=hashsize;j++) {
				if(arr[i]==j) {
					hashArray[j]++;
				}
			}
		}
		for(int i=0;i<=hashsize;i++) {
			
			if(hashArray[i]>=1) {
				System.out.print(i+" ");
			}
			
			
		}
		ref.close();
	}

}
