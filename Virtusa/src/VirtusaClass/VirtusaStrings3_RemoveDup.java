package VirtusaClass;
import java.util.Scanner;
public class VirtusaStrings3_RemoveDup {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		String str=ref.nextLine();
		int len1=str.length();
		int hashArray[]=new int[256];
		for(int i=0;i<len1;i++) {
			for(int j=0;j<256;j++) {
				if(j==(int)str.charAt(i)) {
					hashArray[j]++;
				}
			}
		}
		for(int i=0;i<len1;i++) {
			for(int j=0;j<256;j++) {
				if(hashArray[(int)str.charAt(i)]>=1) {
					hashArray[(int)str.charAt(i)]=0;
					System.out.print(str.charAt(i));
				}
			}
		}
		ref.close();
	}

}
