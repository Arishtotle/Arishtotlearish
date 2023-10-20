import java.util.*;

public class Test5_2{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] ar=new int[n];
for(int i=0;i<n;i++) ar[i]=sc.nextInt();
boolean b=false;

	for(int i=0;i<n;i++){
		for(int j=i;j<n;j++){
		    int sum=0;
			for(int k=i;k<=j;k++){
				sum=sum+ar[k];
			}
		if(sum==0){
		     b=true;
		}
	}
}
if(!b){
System.out.println("false");
}else{
System.out.println("true");
}
}
}
