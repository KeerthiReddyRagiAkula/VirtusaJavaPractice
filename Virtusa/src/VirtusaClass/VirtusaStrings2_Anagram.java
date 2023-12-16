package VirtusaClass;
import java.util.Scanner;
public class VirtusaStrings2_Anagram {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		String str1=ref.nextLine();
		int len1=str1.length();
		String str2=ref.nextLine();
		int len2=str2.length();
		int hashArray[]=new int[256];
		for(int j=0;j<len1;j++) {
			for(int i=0;i<256;i++) {
				if(i==(int)str1.charAt(j)) {
					hashArray[i]++;
				}
			}
		}
		for(int j=0;j<len2;j++) {
			for(int i=0;i<256;i++) {
				if(i==(int)str2.charAt(j)) {
					hashArray[i]--;
				}
			}
		}
		int flag=1;
		for(int i=0;i<256;i++) {
			if(hashArray[i]!=0) {
				flag=0;
				break;
			}
		}
		if(flag==1) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		ref.close();
	}

}
