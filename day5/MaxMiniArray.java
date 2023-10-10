import java.util.*;

public class MaxMiniArray{
public static void main(String[] args){
int num[]={1,2,3,6,4,5,8,9,7};
int l=num.length;
Arrays.sort(num);
int i=0;
int j=l-1;
while(i<=j) System.out.print(num[j--] + "" + num[i++]);
}
}


