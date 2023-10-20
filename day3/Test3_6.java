public class Test3_6{

public static void main(String[] args){

int target=15;
int[] a={2,6,0,9,7,3,1,4,1,10};
int l=-1,r=-2;
for(int i=0;i<a.length;i++){
for(int j=i;j<a.length;j++){
int sum=0;
for(int k=i;k<=j;k++){
sum=sum+a[k];
if(sum==target){
l=i;
r=j;
}
}
}
}
if(l<0){
System.out.println("there are no substring with sum to target");
}else{
for(int i=l;i<=r;i++){
System.out.print(a[i]+" ");
}
}
}
}
