import java.util.*;

public class Test3_2{

public static int Laststone(int[] a){

while(a.length>1){
       Arrays.sort(a);
          int x=a[a.length-2];
          int y=a[a.length-1];
             if(x!=y){
                 a[a.length-2]=y-x;
             }else{
                 a=Arrays.copyOf(a,a.length-2);
             }
}
if(a.length==1){
return a[0];
}else{
return 0;
}
}
public static void main(String[] args){

int[] a={2,7,4,1,8,1};
int res=Laststone(a);

System.out.println(res);

}
}