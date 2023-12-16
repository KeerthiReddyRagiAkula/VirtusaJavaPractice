package VirtusaAssignment;
import java.util.Scanner;
public class VirtusaAssignment4_Union {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		int size1=ref.nextInt();
		int arr1[]=new int[size1];
		for(int i=0;i<size1;i++) {
			arr1[i]=ref.nextInt();
		}
		int size2=ref.nextInt();
		int arr2[]=new int[size2];
		for(int i=0;i<size2;i++) {
			arr2[i]=ref.nextInt();
		}
		int r_size=size1+size2;
		int result[]=new int[r_size];
		for(int i=0;i<size1;i++) {
			result[i]=arr1[i];
		}
		int j=0;
		for(int i=size1;i<r_size;i++) {
			result[i]=arr2[j];
			j++;
		}
		int max=result[0];
		for(int i=0;i<r_size;i++) {
			if(max<=result[i]) {
				max=result[i];
			}
		}
		int hashsize=max+1;
		int hashArray[]=new int[hashsize];
		for(int i=0;i<hashsize;i++) {
			for(int k=0;k<r_size;k++) {
				if(result[k]==i) {
					hashArray[i]++;
				}
			}
		}
		for(int i=0;i<hashsize;i++) {
			if(hashArray[i]>=1) {
				System.out.print(i+" ");
			}
		}
		ref.close();

	}

}
