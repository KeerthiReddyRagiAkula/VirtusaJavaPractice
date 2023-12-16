package VirtusaAssignment;
import java.util.Scanner;
public class VirtusaStrings4_PNP {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		int len=ref.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=ref.nextInt();
		}
		String str=ref.next();
		int s_len=str.length();
		int result=0;
		if(len!=s_len) {
			System.out.println("Error");
		}
		else {
			for(int i=0;i<len;i++) {
				if(str.charAt(i)=='P') {
					result += arr[i];
				}
				else {
					result -= arr[i];
				}
			}
		}
		System.out.println(result*100);
		ref.close();
	}

}
