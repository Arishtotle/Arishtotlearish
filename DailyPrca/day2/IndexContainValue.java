public class IndexContainValue{
public int TotalIndex(int [] num){
int res=0;
int a=2;
for(int i=0;i<num.length;i++){
int rem=num[i];
while(rem>0){
if(rem>0){

int n=rem%10;

if(n==a){
res=res+i;
}

rem=rem/10;
}
}
}
return res;
}

public static void main(String[] args){
int[] num={1,3,124,5,6,12};

IndexContainValue cv=new IndexContainValue();

System.out.println(cv.TotalIndex(num));
}
}

