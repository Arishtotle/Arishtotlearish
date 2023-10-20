import java.util.*;

public class Test4_3{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int[] ar=new int[n];
for(int i=0;i<n;i++)ar[i]=sc.nextInt();
int k=sc.nextInt();
while(k>0){

int temp=ar[n-1];
for(int i=n-1;i>0;i--){
ar[i]=ar[i-1];


}
ar[0]=temp;
k--;
}
for(int i=0;i<n;i++){
System.out.print(ar[i]+" ");
}
}
}
