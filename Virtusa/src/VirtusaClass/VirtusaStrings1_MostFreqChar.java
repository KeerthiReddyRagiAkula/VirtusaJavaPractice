package VirtusaClass;
import java.util.Scanner;
public class VirtusaStrings1_MostFreqChar {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		String str=ref.next();
		int len=str.length();
		int hashArray[]=new int[256];
		for(int j=0;j<len;j++) {
		for(int i=0;i<256;i++) {
			if(i==(int)str.charAt(j)) {
				hashArray[i]++;
			}
		}}
		int max=0;
		for(int i=0;i<256;i++) {
			if(hashArray[max]<hashArray[i]) {
				max=i;
			}
		}
		
		System.out.print((char)max);
		ref.close();
	}

}
