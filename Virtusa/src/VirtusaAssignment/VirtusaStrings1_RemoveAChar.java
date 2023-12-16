package VirtusaAssignment;
import java.util.Scanner;
import java.lang.String;
public class VirtusaStrings1_RemoveAChar {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		String str=ref.nextLine();
		char ch=ref.next().charAt(0);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=ch) {
				System.out.print(str.charAt(i));
			}
		}
		ref.close();
	}

}
