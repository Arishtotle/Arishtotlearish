import java.util.*;

public class Bag_Of_Tokens{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int power=sc.nextInt();
int[] ar=new int[n];
 for(int i=0;i<n;i++){
ar[i]=sc.nextInt();
}
int l=0;
int ans=0;
int maxi=0;
int r=ar.length-1;

while(l<=r){

if(ar[l]<=power){
power=power-ar[l];
++ans;
maxi=Math.max(ans,maxi);
l++;

}else if(ar[l]>power){
power=power+ar[r];

--ans;
maxi=Math.max(ans,maxi);
r--;
}
else{
 break;
}
}
System.out.println(ans);

}
}