import java.util.*;

public class Test5_1{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] ar=new int[n];
for(int i=0;i<n;i++) ar[i]=sc.nextInt();

System.out.println("Maximum continue subarray is : "+Maximumarray(ar,n));

}

public static int Maximumarray(int[] ar,int n){

int maxnow=Integer.MIN_VALUE,maxend=0;
	for(int i=0;i<n;i++){
	   maxend=maxend+ar[i];
		if(maxnow<maxend){
		    maxnow=maxend;
               }
   		      if(maxend<0){
			   maxend=0;
		}
	}
   return maxnow;
  }
}