import java.util.Scanner;

public class SumofTwoElement{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
String ans="there is no sum of two element in array equal to target value";
int ar[]={1,2,3,4,5,6};
for(int i=0;i<ar.length;i++){
for(int j=0;j<ar.length;j++){
if(ar[i]+ar[j]==k){
ans="there is an Sum of two element in array is equal to target value";
}


}

}

System.out.println(ans);

}
}
