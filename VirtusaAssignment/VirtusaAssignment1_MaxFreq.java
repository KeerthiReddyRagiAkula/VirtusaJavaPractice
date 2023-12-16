import java.util.Scanner;
import java.util.Arrays;
class Main{
	public static void main(String args[]) {
		Scanner ref=new Scanner(System.in);
		int size=ref.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=ref.nextInt();
		}
		Arrays.sort(arr);
		int hashsize=arr[size-1];
		int hashArray[]=new int[hashsize];
		for(int i=0;i<hashsize;i++) {
			hashArray[i]=0;
		}
		for(int i=0;i<hashsize;i++) {
			System.out.println(hashArray[i]);
		}
        ref.close();
	}
}