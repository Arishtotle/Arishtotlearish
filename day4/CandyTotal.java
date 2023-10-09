
import java.util.*;
public class CandyTotal {

      public static void main(String[] args) {
		int ar[]= {4,1,2,2,1};
		int k=1;
	
		int l=ar.length;
		boolean sum;
		int max=ar[0];
		for(int j=0;j<l;j++) {
			if(max<=ar[j]) {
				max=ar[j];
			}
		}
                boolean[] a=new boolean[ar.length];
		for(int i=0;i<l;i++) {
			int compare=ar[i]+k;
			if(compare>=max) {
                           a[i]=true;
			}
		}
		
	

	
	 System.out.println(Arrays.toString(a));
}

}