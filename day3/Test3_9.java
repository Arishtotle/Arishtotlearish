import java.util.*;

public class Test3_9{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] ar=new int[n];
int l=ar.length;
for(int i=0;i<n;i++){
ar[i]=sc.nextInt();
}

Arrays.sort(ar);


 int maxi=ar[l-1]-ar[0];
System.out.println("The maximum Difference = "+maxi);



 int mini=ar[1]-ar[0];
System.out.println("The minimum Difference = "+mini);

}
}


