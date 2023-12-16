package VirtusaAssignment;
import java.util.Scanner;
public class VirtusaStrings5_StringReversal {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		String str=ref.nextLine();
		String str_Array[]=str.split(" ");
		int Arraylen=str_Array.length;
		int flag=1;
		for(int i=Arraylen-1;i>=0;i--) {
			if(flag==1) {
				flag=0;
				System.out.print(str_Array[i]+" ");
			}
			else {
				System.out.print(" "+str_Array[i]);;
			}
		}
		
		
		ref.close();
	}

}
