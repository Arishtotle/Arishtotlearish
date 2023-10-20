import java.util.*;

public class Test5_3{

public static int SubArrayProduct(int[] ar,int n){

	if(ar==null || ar.length==0){
 		return 0;
	}
	int maxend=ar[0],minend=ar[0],maxpro=ar[0];
		for(int i=0;i<n;i++){
			if(ar[i]<0){
				int temp=maxend;
				maxend=minend;
				minend=temp;
			}
		maxend=Math.max(ar[i],maxend*ar[i]);
		minend=Math.min(ar[i],minend*ar[i]);
		maxpro=Math.max(maxpro,maxend);
	}
      return maxpro;
    }
public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
 	int n=sc.nextInt();
	int[] ar=new int[n];
		for(int i=0;i<n;i++) ar[i]=sc.nextInt();

			System.out.println(" The maximum product of the sum array is : "+SubArrayProduct(ar,n));
	}
}
