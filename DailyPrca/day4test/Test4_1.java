import java.util.*;

public class Test4_1{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] ar=new int[n];
for(int i=0;i<n;i++)ar[i]=sc.nextInt();
int c=sc.nextInt();
  int count=0;
	for(int i=0;i<n;i++){
		for(int j=i;j<n;j++){
			int sum=0;
			for(int k=i;k<=j;k++){
				sum=sum+k;
			}
			if(sum==c){
				count++;
				}
		}
	}

System.out.println("Total Sub Array Count are : "+count);
}
}