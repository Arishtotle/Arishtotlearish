import java.util.*;

public class Test3_7{

public static void main(String[] args){
int[] a={1,-1,3,2,-7,-5,11,6};
Rearrange(a);
for(int num : a){
System.out.print(num+" ");

}
}
public static void Rearrange(int[] a){
int n=a.length;
int j=0;
for(int i=0;i<n;i++){
              if(a[i]>=0){ 
                  int temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                  j++;
               }
          }
     }
}