import java.util.*;

public class LargestnonNegativeint{
public static void main(String[] args){

int num[]={1,2,3,4,5,6};
int res=0;
int num1=0;

Arrays.sort(num);
for(int i=0;i<num.length;i++){
num1=num1*10+num[i];

}

while(num1>0){
int n=num1%10;
res=res*10+n;
num1=num1/10;

}

System.out.println(res);
}
}
