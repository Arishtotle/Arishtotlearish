import java .util.*;

public class Test4_4{

public static void main(String[] args){

Scanner sc= new Scanner(System.in);

int n=sc.nextInt();
int k=sc.nextInt();
int [] ar=new int[n];
for(int i=0;i<n;i++){
ar[i]=sc.nextInt();
}
int count=0;
for(int i=0;i<n;i++){
for(int j=i;j<n;j++){
if(ar[i]+ar[j]==k){
count++;
continue;
}
}
}
System.out.println("Total Count is : "+count);
}
}

