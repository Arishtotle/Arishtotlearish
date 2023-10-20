public class NearZeroValue{
   public int ClosestNumber(int [] num){
    int min=Integer.MAX_VALUE;
for(int n:num){
if(min+n==0){
min=min>0 ? min:n;
}else if(Math.abs(min)>Math.abs(n)){
min=n;
}
}
return min;

}
public static void main(String[] args){
int [] num={-4,1,-1,2,4,5};
NearZeroValue nz=new NearZeroValue();
System.out.println(nz.ClosestNumber(num));
}
}
