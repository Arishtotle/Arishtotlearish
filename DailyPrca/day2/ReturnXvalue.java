public class ReturnXvalue{
public static void main(String[] args){
int res=1;
int[] num={-1,-2,-3,-4,3,2,1};
for(int i=0;i<num.length;i++){
res=res*num[i];
}

if(res > 0){
System.out.println("the value of X is 1");
}else if(res < 0 ){
System.out.println("the value of X is -1");
}else{
System.out.println("the value of X is zero");
}
}
}
