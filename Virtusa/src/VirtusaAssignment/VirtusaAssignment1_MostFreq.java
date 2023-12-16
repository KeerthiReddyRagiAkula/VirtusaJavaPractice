package VirtusaAssignment;
import java.util.Scanner;
import java.util.Arrays;
public class VirtusaAssignment1_MostFreq {

	public static void main(String[] args) {
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
						int index = 0,max=hashArray[0];
						for(int i=0;i<=hashsize;i++) {
							if(hashArray[i]>=max) {
								max=hashArray[i];
								index=i;
							}
						}
						System.out.println(index + " repeated " + max + " times ");
						ref.close();
					
				
			

		


	}

}
