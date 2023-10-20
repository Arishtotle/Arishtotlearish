import java.util.*;

public class Test3_8{

public static void main(String[] args){

int[] Num={58,24,13,15,63,9,8,7,1,2};
int l=Num.length;
int[] N1=new int[l/2];
int[] N2=new int[l/2];
for(int i=0;i<l/2;i++){
N1[i]=Num[i];

}
for(int i=l/2+1;i<l;i++){
N2[i]=Num[i];
}
System.out.println(Arrays.toString(N1));
System.out.println(Arrays.toString(N1));
}
}
