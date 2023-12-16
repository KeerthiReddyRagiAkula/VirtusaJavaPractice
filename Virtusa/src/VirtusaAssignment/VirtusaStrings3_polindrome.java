package VirtusaAssignment;
import java.util.Scanner;
public class VirtusaStrings3_polindrome {
	public static int pol_or_not(String str) {
		int len=str.length();
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		String str=ref.nextLine();
		int result=pol_or_not(str);
		System.out.println(result);
		ref.close();
	}

}
