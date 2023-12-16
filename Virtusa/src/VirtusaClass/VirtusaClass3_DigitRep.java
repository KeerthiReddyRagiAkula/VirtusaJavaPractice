package VirtusaClass;
import java.util.*;
public class VirtusaClass3_DigitRep {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		int size=ref.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=ref.nextInt();
		}
		Arrays.sort(arr);
		int max=arr[size-1];
		int max_digit=(int)Math.log10(max)+1;
		int b[]=new int[max_digit+1];
		for(int i=0;i<size;i++) {
			int num_of_digit=(int)Math.log10(arr[i])+1;
			b[num_of_digit]++;
		}
		for(int i=0;i< max_digit+1;i++) {
			System.out.println(i+"->"+b[i]);
		}
		ref.close();

	}

}
