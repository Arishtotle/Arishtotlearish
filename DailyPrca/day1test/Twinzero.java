import java.util.*;

public class Twinzero{
public static void main(String[] args){
int c=0;
int [] ar={1,0,2,3,0,4,5,0};
int [] a=new int[ar.length];
for(int i=0;i<ar.length;i++){
if(c==ar.length)break;
if(ar[i]==0){
a[c++]=0;
if(c==ar.length)break;
a[c++]=0;
}else{
a[c++]=ar[i];
}

}

c=0;
for(int ele:a){
ar[c++]=ele;
}
System.out.println(Arrays.toString(ar));
}
}

