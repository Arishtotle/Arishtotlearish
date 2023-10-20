import java.util.*;

public class Test4_6{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

int n=sc.nextInt();

int[] ar=new int[n];
for(int i=0;i<n;i++)ar[i]=sc.nextInt();

int k=sc.nextInt();

for(int i=0;i<n;i++){
if(ar[i]>k){
ar[i]=ar[i]-k;
}else{
ar[i]=ar[i]+k;
}
}
Arrays.sort(ar);


int Maximum=ar[n-1]-ar[0];
System.out.println("the maximum difference is : "+Maximum);
}
}
