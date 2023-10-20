import java.util.*;

public class Test3_5{

public static void main(String[] args){

int[] a={1,2,3,1,4,5,2,3,6};

int[] out=new int[a.length];

     int count =-1,sum=0;
           for(int i=0;i<out.length;i++){
                    
                sum =sum+a[i];
                count++;
                     if(count==3){
                         sum=sum-a[i-3];
                         count=count-1;
                      }
                  out[i]=sum;

                }
int max=0;
for(int i=0;i<out.length;i++){
 if(out[i]>max){
   max=out[i];
}
}
           System.out.print(max);
        }
}

