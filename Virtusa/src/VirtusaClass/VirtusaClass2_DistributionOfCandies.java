package VirtusaClass;
import java.util.Scanner;
public class VirtusaClass2_DistributionOfCandies {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		int candies=ref.nextInt();
		int persons=ref.nextInt();
		int arr[]=new int[persons];
		int per,flag=0,cand=1;
		while(candies>=0) {
			for(per=0;per<persons;per++) {
				if(cand<candies) {
					arr[per]=cand;
					candies -= cand;
					cand++;
					
				}
				else {
					arr[per]+= candies;
					flag=1;
					break;
				}	
			}
			if(flag==1) {
				break;
			}
		}
		for(int i=0;i<persons;i++) {
			System.out.print(arr[i]+" ");
		}
		
			
		ref.close();

	}

}
