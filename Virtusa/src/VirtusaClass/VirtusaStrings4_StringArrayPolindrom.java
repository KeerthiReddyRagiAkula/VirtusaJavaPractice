package VirtusaClass;
import java.util.Scanner;
public class VirtusaStrings4_StringArrayPolindrom {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		String str=ref.nextLine();
		int count=0,flag=0;
		String str_Arr[]=str.split(" ");
		int arr_len=str_Arr.length;
		for(int i=0;i<arr_len;i++) {
			int sub_Arr_len=str_Arr[i].length();
			str_Arr[i]=str_Arr[i].toLowerCase();
			for(int j=0;j<=sub_Arr_len/2;j++) {
				if(str_Arr[i].charAt(j)==str_Arr[i].charAt(sub_Arr_len-1-j)) {
					flag=1;
				}
				else {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				count++;
			}
		}
		System.out.println(count);
		ref.close();
		

	}

}
