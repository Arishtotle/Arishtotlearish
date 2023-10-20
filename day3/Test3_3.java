public class Test3_3{

public static void Rotate(int ar[],int n,int k){
k=k%n;
for(int i=0;i<n;i++){

if(i<k){
System.out.print(ar[n+i-k]+" ");
}
else
{
System.out.print(ar[i-k]+" ");
}
}

}
public static void main(String[] args){

int[] ar={1,2,3,4,5,6,7};
int n=ar.length;
int k=3;

Rotate(ar,n,k);

}
}